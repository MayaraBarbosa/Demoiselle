/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import br.data.entity.Fabricante;
import java.text.Normalizer;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;


/**
 *
 * @author Tamy
 */
public class CrudFabricante extends AbstractCrud<br.data.entity.Fabricante>{
    
    private EntityManager em;
    
    private static final String PU = EMNames.EMN1;
    
    public CrudFabricante(){
        super(Fabricante.class);
    }
    
    /*@Override
    protected EntityManager getEntityManager(){
        if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
    }*/
    
    public Collection<Fabricante> SelectByNome(String nome) {
       try {
            nome = Normalizer.normalize(nome, Normalizer.Form.NFD);
	    nome = nome.replaceAll("[^\\p{ASCII}]", "");
            return getEntityManager().createNamedQuery("Fabricante.findByNome")
                   .setParameter("nome", "%" + nome.toUpperCase() + "%").getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    
    }

    @Override
    protected EntityManager getEntityManager() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}