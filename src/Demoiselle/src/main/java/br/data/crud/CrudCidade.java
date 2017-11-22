/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import br.data.entity.Cidade;
import java.text.Normalizer;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author alexandrelerario
 */
public class CrudCidade extends AbstractCrud<br.data.entity.Cidade> {

    private EntityManager em;

    private static final String PU = EMNames.EMN1;

    public CrudCidade() {
        super(Cidade.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
    }

    public Collection<Cidade> SelectByNome(String nome) {
       try {
           //Remove a acentuação da string
            nome = Normalizer.normalize(nome, Normalizer.Form.NFD);
	    nome = nome.replaceAll("[^\\p{ASCII}]", "");
            return getEntityManager().createNamedQuery("Cidade.findByNome").setParameter("nome", "%" + nome.toUpperCase() + "%").getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    
    }

}
