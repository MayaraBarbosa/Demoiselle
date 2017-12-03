/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import br.data.entity.Promocao;
import java.text.Normalizer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Hiroshi
 */
public class CrudPromocao extends AbstractCrud<br.data.entity.Promocao>{

    private EntityManager em;
    private static final String PU = EMNames.EMN1;

    public CrudPromocao() {
        super(Promocao.class);
    }

    @Override
    protected EntityManager getEntityManager() {
    if (em == null) {
            em = Persistence.createEntityManagerFactory(PU).createEntityManager();
        }
        return em;
    }

    @Override
    public List<Promocao> getAll(){
        try{
        return getEntityManager().createNamedQuery("Promocao.findAll").getResultList();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public List<Promocao> selectByDescricao(String descricao){
        try {
           //Remove a acentuação da string
            descricao = Normalizer.normalize(descricao, Normalizer.Form.NFD);
	    descricao = descricao.replaceAll("[^\\p{ASCII}]", "");
            return getEntityManager().createNamedQuery("Promocao.findByDescricao").setParameter("descricao", "%" + descricao.toUpperCase() + "%").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    
    }

    public List<Promocao> selectPromocoesAtivas() {
        try{
            return getEntityManager().createNamedQuery("Promocao.findPromocoesAtivas").getResultList();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    
    
}
