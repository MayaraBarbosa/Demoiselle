/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.crud.CrudPromocao;
import br.data.entity.Promocao;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Hiroshi
 */
@ManagedBean
@RequestScoped
public class JsfPromocao {
    
    private Integer idpromocao;
    private String descricao = "";
    private UploadedFile imagem;
    private String nomeimagem;
    private boolean ativo;
    public JsfPromocao(){}
    
    public List<Promocao> getSelect(){
        return new CrudPromocao().selectByDescricao(descricao);
    }

    public List<Promocao> getPromocoesAtivas(){
        return new CrudPromocao().selectPromocoesAtivas();
    }
    
    public void persist(){
        if(imagem == null){
            System.out.println("Sem imagem");
        }else{ 
            String nomeImg = new java.util.Date().toString();
            nomeImg = nomeImg.replaceAll("\\s+", "");
            nomeImg = nomeImg.replaceAll(":", "");
            String tipoArquivo = imagem.getFileName();
            tipoArquivo = tipoArquivo.substring(tipoArquivo.lastIndexOf("."));
            nomeImg = nomeImg.concat(tipoArquivo);
            try{
                String path = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/") + "uploaded";
                File arq = new File(path);
                if (!arq.exists()) arq.mkdir(); //Cria pasta /uploaded 
                arq = new File(path, nomeImg);
                arq.createNewFile();
                InputStream inS = imagem.getInputstream();
                OutputStream ouS = new FileOutputStream(arq);
                byte[] buf = new byte[1024];
                int read = 0;
                while((read = inS.read(buf)) != -1){
                    ouS.write(buf, 0, read);
                }
            }catch(IOException er){
                er.printStackTrace();
            }
            Promocao promo = new Promocao();
            promo.setDescricao(descricao);
            promo.setNomeimagem(nomeImg);
            promo.setAtivo(ativo);
            new CrudPromocao().persist(promo);
        }
    }
    
    public void remove(Promocao promo){
        new CrudPromocao().remove(promo);
    }
    
    
    public String update(Promocao promo){
        this.descricao = promo.getDescricao();
        this.idpromocao= promo.getIdpromocao();
        this.nomeimagem = promo.getNomeimagem();
        this.ativo = promo.isAtivo();
        return "merge.xhtml";
    }
    
    public String merge(){
        Promocao promo;
        promo = new br.data.crud.CrudPromocao().find(this.idpromocao);
        promo.setDescricao(this.descricao);
        promo.setNomeimagem(this.nomeimagem);
        promo.setAtivo(ativo);
        new br.data.crud.CrudPromocao().merge(promo);
        this.idpromocao = null;
        this.descricao = "";
        this.nomeimagem = "";
        return "listall.xhtml";
    }

    
    public UploadedFile getImagem() {
        return imagem;
    }

    public void setImagem(UploadedFile imagem) {
        this.imagem = imagem;
    }
    
    public Integer getIdpromocao() {
        return idpromocao;
    }

    public void setIdpromocao(Integer idpromocao) {
        this.idpromocao = idpromocao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeimagem() {
        return nomeimagem;
    }

    public void setNomeimagem(String nomeimagem) {
        this.nomeimagem = nomeimagem;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<Promocao> getLista() {
        return new CrudPromocao().getAll();
    }
    

    
    
}
