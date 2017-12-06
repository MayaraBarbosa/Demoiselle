/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import br.data.entity.Aeronave;
import java.text.Normalizer;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;


/**
 *
 * @author Tamy
 */
public class CrudAeronave extends AbstractCrud<br.data.entity.Aeronave>{
    
    private EntityManager em;
    
    private static final String PU = EMNames.EMN1;
    
    public CrudAeronave(){
        super(Aeronave.class);
    }
    
    /*@Override
    protected EntityManager getEntityManager(){
        if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
    }*/
    
    public Collection<Aeronave> SelectByModelo(String modelo) {
       try {
            modelo = Normalizer.normalize(modelo, Normalizer.Form.NFD);
	    modelo = modelo.replaceAll("[^\\p{ASCII}]", "");
            return getEntityManager().createNamedQuery("Aeronave.findByModelo")
                   .setParameter("modelo", "%" + modelo.toUpperCase() + "%").getResultList();
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
