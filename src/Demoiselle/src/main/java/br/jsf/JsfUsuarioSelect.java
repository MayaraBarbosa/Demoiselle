/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.crud.CrudUsuario;
import br.data.entity.Usuario;
import java.util.Collection;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author bruno
 */
@ManagedBean
@SessionScoped
public class JsfUsuarioSelect {
    
    private String nome = new String();
    private List<Usuario> usuarios;

    public JsfUsuarioSelect() {
    }
    
    public List<Usuario> getSelect() {
        usuarios = new CrudUsuario().findByNome(nome);
        return usuarios;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
