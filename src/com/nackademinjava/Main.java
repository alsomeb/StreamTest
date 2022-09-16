package com.nackademinjava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Gurra", "David", "Alex", "Andreas"));

        List<String> sortedNames = names.stream().sorted(Comparator.comparing(name -> name)).toList();
        System.out.println(names);
        System.out.println("Sorted: " + sortedNames);

        // Finns "Andreas" i listan

        boolean isAndreasInList = names.stream().anyMatch(name -> name.equalsIgnoreCase("Andreas"));
        System.out.println(isAndreasInList);

        // Finns Peter INTE i listan
        boolean isPeterInList = names.stream().noneMatch(name -> name.equalsIgnoreCase("peter"));
        System.out.println(isPeterInList);

        System.out.println();

        Runnable myAnonRunnable = () -> {
            System.out.println("hej");
            names.forEach(name -> System.out.println(name));
        };

        myAnonRunnable.run();
    }
}
