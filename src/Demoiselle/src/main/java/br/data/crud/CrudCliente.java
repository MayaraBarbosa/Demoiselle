/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import br.data.entity.Cliente;
import br.data.entity.Role;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

/**
 *
 * @author bruno
 */
public class CrudCliente extends AbstractCrud<Cliente> {
    
    private EntityManager em;

    private static final String PU = EMNames.EMN1;

    public CrudCliente() {
        super(Cliente.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
    }
    
    public Cliente findByEmail(String email, String password) {
        Cliente cliente;
        try {
            String passEncrypt = encript(password);
            cliente = createNamedQuery("Cliente.findByEmail")
                    .setParameter("email", email)
                    .setParameter("password", passEncrypt)
                    .getSingleResult();
            cliente.setPassword(null);
            return cliente;
        } catch(NoResultException e) {
            return null;
        }
    }
    
    public void salvar(Cliente cliente) {
        cliente.setPassword(encript(cliente.getPassword()));
        cliente.setRole(role());
        this.persist(cliente);
    }
    
    private String encript(String senha) {
        try {
            MessageDigest senhaEncript = MessageDigest.getInstance("SHA-256");
            byte digest[] = senhaEncript.digest(senha.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            for (byte b: digest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            return hexString.toString();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException ex) {
            Logger.getLogger(CrudUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return senha;
    }
    
    private Role role() {
        List<Role> role = new CrudRole().getAll();
        Role r1 = new Role();
        for (Role r : role) {
            if (r.getNome().equals("CLIENTE"))
                return r;
            r1 = r;
        }
        Role r2 = new Role();
        r2.setIdrole(r1.getIdrole()+1);
        r2.setNome("CLIENTE");
        new CrudRole().persist(r2);
        return r2;
    }
}
