/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.crud.CrudCliente;
import br.data.entity.Cliente;
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
public class JsfLoginCliente implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String email;
    private String senha;
    
    public JsfLoginCliente() {
    }
    
    public String validarCliente() {
        System.out.println("Autenticador....");
        
        Cliente cli = new CrudCliente().findByEmail(email, senha);
        if (cli != null) {
            System.out.println("Cliente correto.....");
            System.out.println("Cliente autentic: : " + cli.getNome());
            SessionsUtils.setParam("user", cli);
            
            return "/faces/navegacao/index.xhtml?faces-redirect=true";
        } else {
            System.out.println("Usuário não autenticado.");
            return "/faces/loginCliente.xhtml?faces-redirect=true";
        }
    }
    
    public String logout() {
        System.out.println("user: : " + SessionsUtils.getUserName(Cliente.class));
        SessionsUtils.invalidate();
        return "/faces/index.xhtml?faces-redirect=true";   
    }

    public String getUserName() {
        return SessionsUtils.getUserName(Cliente.class);
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
