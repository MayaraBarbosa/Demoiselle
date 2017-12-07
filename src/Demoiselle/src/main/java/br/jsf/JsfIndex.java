/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.crud.EMNames;
import java.util.List;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

/**
 *
 * @author mist
 */
@ManagedBean
@SessionScoped
public class JsfIndex {
 
    public List<Object[]> getItens() {
        return itens;
    }

    public void setItens(List<Object[]> itens) {
        this.itens = itens;
    }
    
    private List<Object[]> itens = null; 
    
    
    public int getIdAeroportoOrigem() {
        return idAeroportoOrigem;
    }

    public void setIdAeroportoOrigem(int idAeroportoOrigem) {
        this.idAeroportoOrigem = idAeroportoOrigem;
    }

    public int getIdAeroportoDestino() {
        return idAeroportoDestino;
    }

    public void setIdAeroportoDestino(int idAeroportoDestino) {
        this.idAeroportoDestino = idAeroportoDestino;
    }

    public Date getDataIda() {
        return dataIda;
    }

    public void setDataIda(Date dataIda) {
        this.dataIda = dataIda;
    }

    public Date getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(Date dataVolta) {
        this.dataVolta = dataVolta;
    }
    
    private int idAeroportoOrigem;
    private int idAeroportoDestino;
    private Date dataIda;
    private Date dataVolta;
    
    private EntityManager em;

    private static final String PU = EMNames.EMN1;
    
    protected EntityManager getEntityManager() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
    }
    
        public String top(){
        Query q = this.getEntityManager().createNativeQuery(""
                + "SELECT "
                + "v.idvoo, "
                + "r.idrota, "
                + "v.datahoraembarque, "
                + "r.duracao_voo, "
                + "p.valor, "
                + "a.nome, "
                + "b.nome "
                + "FROM "
                + "Voo v "
                + "INNER JOIN Rota r ON (v.idrota = r.idrota) "
                + "INNER JOIN Aeroporto a ON (r.aeroportoorigem = a.idaeroporto) "
                + "INNER JOIN Aeroporto b ON (r.aeroportodestino = b.idaeroporto) "
                + "INNER JOIN Promocao p ON (p.idpromocao = r.idpromocao) "
                + "WHERE "
                + "v.datahoraembarque BETWEEN ? AND ? "
                + "AND b.idaeroporto = ? "
                + "AND a.idaeroporto = ?;");
        q.setParameter(1, getDataIda());
        q.setParameter(2, getDataVolta());
        q.setParameter(3, getIdAeroportoDestino());
        q.setParameter(4, getIdAeroportoOrigem());
        List<Object[]> res = q.getResultList();
        this.setItens(res);
        return "listItens.xhtml";
    }
    

}
