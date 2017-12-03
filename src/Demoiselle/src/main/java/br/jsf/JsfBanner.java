/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.crud.CrudBanner;
import br.data.entity.Banner;
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
public class JsfBanner {
    
    private Integer idbanner;
    private String descricao = "";
    private UploadedFile imagem;
    private String nomeimagem;
    private boolean ativo;
    public JsfBanner(){}
    
    public List<Banner> getSelect(){
        return new CrudBanner().selectByDescricao(descricao);
    }

    public List<Banner> getBannersAtivos(){
        return new CrudBanner().selectBannersAtivos();
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
            Banner promo = new Banner();
            promo.setDescricao(descricao);
            promo.setNomeimagem(nomeImg);
            promo.setAtivo(ativo);
            new CrudBanner().persist(promo);
        }
    }
    
    public void remove(Banner promo){
        new CrudBanner().remove(promo);
    }
    
    
    public String update(Banner banner){
        this.descricao = banner.getDescricao();
        this.idbanner= banner.getIdbanner();
        this.nomeimagem = banner.getNomeimagem();
        this.ativo = banner.isAtivo();
        return "merge.xhtml";
    }
    
    public String merge(){
        Banner banner;
        banner = new br.data.crud.CrudBanner().find(this.idbanner);
        banner.setDescricao(this.descricao);
        banner.setNomeimagem(this.nomeimagem);
        banner.setAtivo(ativo);
        new br.data.crud.CrudBanner().merge(banner);
        this.idbanner = null;
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

    public Integer getIdbanner() {
        return idbanner;
    }

    public void setIdbanner(Integer idbanner) {
        this.idbanner = idbanner;
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

    public List<Banner> getLista() {
        return new CrudBanner().getAll();
    }
    

    
    
}
