/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;


import br.data.entity.Passagem;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author lucas agustini
 */
public class CrudPassagem extends AbstractCrud<br.data.entity.Passagem> {

    private EntityManager em;

    private static final String PU = EMNames.EMN1;

    public CrudPassagem() {
        super(Passagem.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
    }
    
    public List<Passagem> selectByIdpassagem(int idpassagem) { 
        try { 
            Query query = getEntityManager().createNamedQuery("Passagem.findByIdpassagem");
            query.setParameter("idpassagem", idpassagem);  
            return query.getResultList(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        }
         
        return null; 
    }

}
