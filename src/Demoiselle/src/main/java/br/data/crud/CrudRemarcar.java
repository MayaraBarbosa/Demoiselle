/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import br.data.entity.Remarcar;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Kelson
 */
public class CrudRemarcar extends AbstractCrud<Remarcar> {
    
    private EntityManager em;

    private static final String PU = EMNames.EMN1;

    public CrudRemarcar() {
        super(Remarcar.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
    }

}