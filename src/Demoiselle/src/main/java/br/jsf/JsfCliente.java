/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.crud.CrudCliente;
import br.data.entity.Cliente;
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
public class JsfCliente implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Cliente cliente = new Cliente();

    public JsfCliente() {
    }
    
    public void persist() {
        new CrudCliente().salvar(this.cliente);
        this.cliente = new Cliente();
    }
    
    public List<Cliente> getAll() {
        return new CrudCliente().getAll();
    }

    public void remove(Cliente cliente) {
        new CrudCliente().remove(cliente);
    }
    
    public String update(Cliente cliente) {
        this.cliente = cliente;
        return "merge.xhtml";
    }
    
    public String merge() {
        Cliente cli = new CrudCliente().find(this.cliente.getIdcliente());
        cli.setNome(this.cliente.getNome());
        cli.setEmail(this.cliente.getEmail());
        cli.setDatanascimento(this.cliente.getDatanascimento());
        
        new CrudCliente().merge(cli);
        this.cliente = new Cliente();
        return "listall.xhtml";
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
