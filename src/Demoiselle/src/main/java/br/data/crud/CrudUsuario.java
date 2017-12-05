/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import br.data.entity.Usuario;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.Normalizer;
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
public class CrudUsuario extends AbstractCrud<Usuario> {

    
    private EntityManager em;

    private static final String PU = EMNames.EMN1;
    
    public CrudUsuario() {
        super(Usuario.class);
    }
    
    public Usuario findByEmail(String email, String password) {
        Usuario user;
        try {
            String passEncrypt = encript(password);
            user = createNamedQuery("Usuario.findByEmail")
                    .setParameter("email", email)
                    .setParameter("password", passEncrypt)
                    .getSingleResult();
            user.setPassword(null);
            return user;
        } catch(NoResultException e) {
            return null;
        }
    }
    
    public List<Usuario> findByNome(String nome) {
        try {
            List<Usuario> usuarios = createNamedQuery("Usuario.findByNome")
                    .setParameter("nome", "%" + nome + "%")
                    .getResultList();
            for (Usuario u : usuarios) {
                u.setPassword(null);
            }
            return usuarios;
        } catch(NoResultException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void salvar(Usuario usuario) {
        usuario.setPassword(encript(usuario.getPassword()));
        
        this.persist(usuario);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
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
    
}
