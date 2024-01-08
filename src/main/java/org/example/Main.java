package org.example;
import org.example.RTI_JAVA.ElementCounter;
import groovy.lang.Binding;
import groovy.lang.GroovyShell;

public class Main {
    public static void main(String[] args) {
        Binding binding = new Binding();
        GroovyShell shell = new GroovyShell(binding);

        String scriptPath = "org/example/RTI_groovy/ElementCounterGroovy.groovy";
        try {
            Object result = shell.run(scriptPath, "ElementCountGroovy", (String[]) new Object[]{new Integer[]{1, 3, 4, 5, 1, 5, 4}});
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }



        System.out.println("Hello world!");
        ElementCounter.counter();


    }
}