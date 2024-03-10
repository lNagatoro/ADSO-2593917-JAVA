<?php
    include "Conexion.php";
    if (!empty($_POST["id_cuestionario"]) || !empty($_GET["id_cuestionario"])) {
        $id_cuestionario = (!empty($_POST["id_cuestionario"])) ? $_POST["id_cuestionario"] : $_GET["id_cuestionario"];

        try {
            $consulta = $base_de_datos->prepare("SELECT * FROM respuestas WHERE id_cuestionario = :id ");
            $consulta->bindParam(":id", $id_cuestionario);
            $consulta->execute();

            $datos =  $consulta->fetchAll(PDO::FETCH_ASSOC);
            $datos = mb_convert_encoding($datos, "UTF-8", "iso-8859-1");

            $consulta_respuestas = $base_de_datos->prepare("SELECT id_pregunta FROM respuestas WHERE id_cuestionario = :id_cuestionario");
            $consulta_respuestas->bindParam(":id_cuestionario", $id_cuestionario, PDO::PARAM_INT);
            $consulta_respuestas->execute();

            $id_preguntas = $consulta_respuestas->fetchAll(PDO::FETCH_COLUMN);
            $consulta_d = $base_de_datos->prepare(" SELECT preguntas.*, respuestas.estado, respuestas.respuesta, opciones.id AS respuesta FROM preguntas INNER JOIN respuestas ON preguntas.id = respuestas.id_pregunta INNER JOIN opciones ON respuestas.respuesta = opciones.descripcion WHERE preguntas.id = :id_pregunta");

            $respuestas_cues = [];
            $opciones_cues = [];
            $datos_cues = []; 
            foreach ($id_preguntas as $id_pregunta) {
                $consulta->bindParam(":id_pregunta", $id_pregunta, PDO::PARAM_INT);
                $consulta->execute();

                $pregunta = $consulta->fetch(PDO::FETCH_ASSOC);
                if ($pregunta) {
                    $opciones = $base_de_datos->prepare("SELECT * FROM opciones WHERE id_pregunta = :id_pregunta2");
                    $opciones->bindParam(":id_pregunta2", $id_pregunta, PDO::PARAM_INT);
                    $opciones->execute();

                    $opciones_resultado = $opciones->fetchAll(PDO::FETCH_ASSOC);

                    $opciones_cues = [];

                    foreach ($opciones_resultado as $veredicto) {
                        $opcion_objeto = (object) $veredicto;
                        $opciones_cues[] = $opcion_objeto; 
                    }

                    $respuestas_cues = [
                        "pregunta" => $pregunta,
                        "opciones" => $opciones_cues
                    ];

                    $objeto_respuesta = (object) $respuestas_cues; 
                    $datos_cues[] = $objeto_respuesta; 
                }
            }

            $datos = $datos_cues;
            if (!empty($respuestas_cues)) {
                echo json_encode([
                    "status" => true,
                    "message" => "DATA##OK",
                    "respuestas" => $datos
                ]);
            } else {
                echo json_encode([
                    "status" => false,
                    "message" => "No se encontraron preguntas"
                ]);
            }
        } catch (PDOException $e) {
       
            echo json_encode([
                "status" => false,
                "message" => "Error en la consulta: " . $e->getMessage()
            ]);
        }
    }   else {
        $respuesta = [
                        "status" => false,
                        "message" => "ERROR##DATOS##POST"
                    ];

        echo json_encode($respuesta);
    }
?>