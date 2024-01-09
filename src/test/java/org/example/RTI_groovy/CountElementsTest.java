package org.example.RTI_groovy;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountElementsTest {

    @Test
    public void CountElementsTest() throws IOException {
        Binding binding = new Binding();
        GroovyShell shell = new GroovyShell(binding);
        Object result = shell.run(new File("ElementCounterGroovy"), new String[]{"1", "2", "3", "4"});
        assertEquals(4, result);
    }
}
