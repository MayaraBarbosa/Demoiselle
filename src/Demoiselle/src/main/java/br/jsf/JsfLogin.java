/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.crud.CrudUsuario;
import br.data.entity.Usuario;
import br.util.SessionsUtils;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author bruno
 */
@ManagedBean
@SessionScoped
public class JsfLogin implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private boolean ativo = false;
    private String email;
    private String password;
    private final CrudUsuario crudUsuario = new CrudUsuario();
 
    public JsfLogin() {
    }
    
    public String validarUsuario() {
        System.out.println("Autenticador....");
        
        Usuario user = crudUsuario.findByEmail(email, password);
        System.out.println("user autentic: : " + user);
        if (user != null) {
            System.out.println("Usuário correto.....");
            SessionsUtils.setParam("user", user);
            
            return "/faces/operacoes/index.xhtml?faces-redirect=true";
        } else {
            return "/faces/login.xhtml?faces-redirect=true";
        }
    }
    
    public String getUserName() {
        return SessionsUtils.getUserName(Usuario.class);
    }
    
    public String logout() {
        System.out.println("user: : " + SessionsUtils.getUserName(Usuario.class));
        SessionsUtils.invalidate();
        
        return "/faces/index.xhtml?faces-redirect=true";
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
