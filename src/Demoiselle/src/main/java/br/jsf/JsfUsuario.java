/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.crud.CrudUsuario;
import br.data.entity.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author bruno
 */
@ManagedBean
@RequestScoped
public class JsfUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Usuario usuario = new Usuario();
    
    public JsfUsuario() {}
    
    public void persist() {
        new CrudUsuario().salvar(usuario);
        this.usuario = new Usuario();
    }
    
    public List<Usuario> getAll() {
        return new CrudUsuario().getAll();
    }
    
    public void remove(Usuario usuario) {
        new CrudUsuario().remove(usuario);
    }
    
    public String update(Usuario usuario) {
        this.usuario = usuario;
        return "merge.xhtml";
    }
    
    public String merge() {
        Usuario user = new CrudUsuario().find(this.usuario.getIdUsuario());
        user.setNome(this.usuario.getNome());
        user.setEmail(this.usuario.getEmail());
        user.setDataNascimento(this.usuario.getDataNascimento());
        
        new CrudUsuario().merge(user);
        this.usuario = new Usuario();
        return "listall.xhtml";
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
