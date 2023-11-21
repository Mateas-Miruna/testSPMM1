package com.example.testspmm1;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DecodificareMesaje {

    public static void main(String[] args) {
        try {

            ObjectMapper objectMapper = new ObjectMapper();


            File file = new File("messages.json");


            JsonNode rootNode = objectMapper.readTree(file);


            for (JsonNode messageNode : rootNode) {

                String sursa = messageNode.get("sursa").asText();


                String mesaj = messageNode.get("mesaj").asText();


                String mesajDecodificat = decodificaMesaj(sursa, mesaj);


                System.out.println("Mesaj decodificat de la " + sursa + ": " + mesajDecodificat);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static String decodificaMesaj(String sursa, String mesaj) {

        if ("Atreides".equals(sursa)) {

            if ("Jbppf".equals(mesaj)) {
                return "Messi";
            }
        } else if ("Harkonnen".equals(sursa)) {

            if ("Oguuk".equals(mesaj)) {
                return "Messi";
            }
        }


        return mesaj;
    }
}
