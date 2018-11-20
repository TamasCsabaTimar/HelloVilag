/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellovilag;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tamas
 */
public class HelloVilagTest {
    
    @Test
    public void testMain() throws UnsupportedEncodingException {
        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(bs);
        System.setOut(ps);
        HelloVilag.main(null);
        assertEquals("Helló Világ!", bs.toString().trim());
    }
    
}
