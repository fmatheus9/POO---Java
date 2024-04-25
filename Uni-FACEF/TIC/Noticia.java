public class Noticia {
    private String titulo;
    private String descricao;
    private String link;
    private String imageUrl;

    public Noticia() {
    }

    public Noticia(String titulo, String descricao, String link, String imageUrl) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setLink(link);
        this.setImageUrl(imageUrl);
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
