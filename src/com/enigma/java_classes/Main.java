package com.enigma.java_classes;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        String name = "Muhammad Rafi Hadiyasa";

        // Lower Case
        String lowerCaseName = name.toLowerCase();
        System.out.println(lowerCaseName);

        // Split String
        String[] splitName = name.split(" ");

        for (String value : splitName){
            System.out.println(value);
        }

        // String check
        System.out.println(" ".isBlank()); // isBlank spasi dianggap kosong --> True
        System.out.println("".isEmpty()); // isEmpty untuk string kosong --> True

        // String Builder
        StringBuilder builder = new StringBuilder();
        builder.append("Dinda");
        builder.append(" ");
        builder.append("Aura");
        builder.append(" ");
        builder.append("Thifaal");

        String nameBuilder = builder.toString();
        System.out.println(nameBuilder);


        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.totalMemory());

        System.out.println("-".repeat(30));

        for (int i = 0; i < 100; i++) {
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid);
        }
    }
}
