/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import br.data.entity.Cidade;
import java.util.Collection;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexandrelerario
 */
public class CrudCidadeTest {
    
    public CrudCidadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEntityManager method, of class CrudCidade.
     */
   /* @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        CrudCidade instance = new CrudCidade();
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of SelectByNome method, of class CrudCidade.
     */
  
    @Test
    public void testSelectByNome() {
        System.out.println("SelectByNome");
        String nome = "s"; // 5 cidades precisam ser encontradas...
        CrudCidade instance = new CrudCidade();
        //Collection<Cidade> expResult = null;
        Collection<Cidade> result = instance.SelectByNome(nome);
       // assertEquals(expResult, result);
        assertEquals(5, result.size());
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
