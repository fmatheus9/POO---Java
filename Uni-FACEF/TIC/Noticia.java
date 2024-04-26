public class Noticia {
    private String titulo;
    private String descricao;
    private String link;
    private String imageUrl;
    Funcionario funcionario;

    public Noticia() {
    }

    public Noticia(String titulo, String descricao, String link, String imageUrl, Funcionario funcionario) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setLink(link);
        this.setImageUrl(imageUrl);
        this.setFuncionario(funcionario);
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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
