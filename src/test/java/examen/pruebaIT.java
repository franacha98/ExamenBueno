/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Fran
 */
public class pruebaIT {
    
    public pruebaIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of aProbar method, of class prueba.
     */
    @Test
    public void testAProbar() {
        System.out.println("aProbar");
        int q = 2;
        int expResult = 4;
        int result = prueba.aProbar(q);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
         q = 0;
         expResult = 0;
         result = prueba.aProbar(q);
        assertEquals(expResult, result);
        
    }
   
}
