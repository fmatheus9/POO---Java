package unifacef.edo.tic.model.DTOs;


import unifacef.edo.tic.model.entities.AdministradorEntity;
import unifacef.edo.tic.model.entities.BlogEntity;

public class NoticiaDTO {

    private String titulo;
    private String descricao;
    private String link;
    private String imagemURL;
    private AdministradorEntity administrador;
    private BlogEntity blog;

    public AdministradorEntity getAdministrador() {
        return administrador;
    }

    public void setAdministrador(AdministradorEntity administrador) {
        this.administrador = administrador;
    }

    public BlogEntity getBlog() {
        return blog;
    }

    public void setBlog(BlogEntity blog) {
        this.blog = blog;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImagemURL() {
        return imagemURL;
    }

    public void setImagemURL(String imagemURL) {
        this.imagemURL = imagemURL;
    }


}
