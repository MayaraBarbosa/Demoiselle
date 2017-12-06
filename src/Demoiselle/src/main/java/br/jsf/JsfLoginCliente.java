/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.crud.CrudCliente;
import br.data.entity.Cliente;
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
public class JsfLoginCliente implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String email;
    private String password;
    
    public JsfLoginCliente() {
    }
    
    public String validarCliente() {
        System.out.println("Autenticador....");
        
        Cliente cli = new CrudCliente().findByEmail(email, password);
        if (cli != null) {
            System.out.println("Usuário correto.....");
            System.out.println("Cliente autentic: : " + cli.getNome());
            SessionsUtils.setParam("user", cli);
            
            return "/faces/navegacao/index.xhtml?faces-redirect=true";
        } else {
            System.out.println("Usuário não autenticado.");
            return "/faces/loginCliente.xhtml?faces-redirect=true";
        }
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
