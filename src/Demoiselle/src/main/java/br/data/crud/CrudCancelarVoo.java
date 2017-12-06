/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import br.data.entity.Voo;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author alexandrelerario
 */
public class CrudCancelarVoo extends AbstractCrud<br.data.entity.Voo> {

    private EntityManager em;

    private static final String PU = EMNames.EMN1;

    public CrudCancelarVoo() {
        super(Voo.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
    }

//        public Collection<Cidade> SelectByNome(String nome) {
//       try {
//            return getEntityManager().createNamedQuery("Cidade.findByNome").setParameter("nome", "%" + nome.toUpperCase() + "%").getResultList();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return null;
//    
//    }
}
