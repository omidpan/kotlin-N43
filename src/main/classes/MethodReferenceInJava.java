package main.classes;

import java.util.List;

/**
 * This is an example of java code in method reference
 */
public class MethodReferenceInJava {


   static List<String> names=List.of("Leo","Mori","Mary","Ben");

    public static void main(String[] args) {
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
