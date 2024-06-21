package unifacef.edo.tic.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_noticia")
public class NoticiaEntity {
    @Id
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "link")
    private String link;
    @Column(name = "imagemURL")
    private String imagemURL;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="administrador_id")
    private AdministradorEntity administrador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="blog_id")
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
