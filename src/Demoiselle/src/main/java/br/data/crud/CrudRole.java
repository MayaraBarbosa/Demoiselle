/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;


import br.data.entity.Role;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author alexandrelerario
 */
public class CrudRole extends AbstractCrud<br.data.entity.Role> {

    private EntityManager em;

    private static final String PU = EMNames.EMN1;

    public CrudRole() {
        super(Role.class);
    }
    
    public Role findCliente() {
        Role role = createNamedQuery("Role.findByNome")
                .setParameter("nome", "CLIENTE")
                .getSingleResult();
        return role;
    }

    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
    }

}
