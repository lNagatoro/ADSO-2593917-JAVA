<?php
    include "Conexion.php";

    if (!empty($_POST["id_cuestionario"]) || !empty($_GET["id_cuestionario"])){
        $id_cuestionario = (!empty($_POST["id_cuestionario"])) ? $_POST["id_cuestionario"] : $_GET["id_cuestionario"];

        try {
            $consulta_pregunta = $base_de_datos->prepare("SELECT preguntas.* FROM preguntas WHERE preguntas.id NOT IN (SELECT respuestas.id_pregunta FROM respuestas WHERE id_cuestionario = :idc)");
            $consulta_pregunta->bindParam(":idc", $id_cuestionario);
            $consulta_pregunta->execute();

            $preguntas =  $consulta_pregunta->fetchAll(PDO::FETCH_ASSOC);
            $posicion = random_int(0 , sizeof($preguntas)-1);
            $pregunta = $preguntas[$posicion];

            $consultar_opciones = $base_de_datos->prepare("SELECT * FROM opciones WHERE id_pregunta = :idp");
            $consultar_opciones->bindParam(":idp", $pregunta['id'] );
            $consultar_opciones->execute();

            $resultados = $consultar_opciones->fetchAll(PDO::FETCH_ASSOC);
            if ($pregunta) {
                $respuesta = [
                    "status" => true,
                    "message" => "DATA##OK",
                    "cant_preguntas" => sizeof($preguntas),
                    "preguntas" => $pregunta,
                    "opciones" => $resultados
                ];
                echo json_encode($respuesta);
            } else {
                echo json_encode([
                    "status" => false,
                    "message" => "No se encontraron preguntas en la base de datos"
                ]);
            }
        } catch (PDOException $e) {
            echo json_encode([
                "status" => false,
                "message" => "Error en la consulta: " . $e->getMessage()
            ]);
        }
        
        
    }

?>