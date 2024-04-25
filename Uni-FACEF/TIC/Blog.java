import java.util.ArrayList;
import java.util.List;
public class Blog {
    private List<Noticia> noticias;

    public Blog(List<Noticia> noticias) {
        this.noticias = new ArrayList<Noticia>();
    }

    public List<Noticia> getNoticias() {
        return noticias;
    }

    public void setNoticias(List<Noticia> noticias) {
        this.noticias = noticias;
    }
    public void createPost(String titulo, String descricao, String link, String imageUrl){
        this.noticias.add(new Noticia(titulo, descricao, link, imageUrl));
    }

    @Override
    public String toString() {
        return "Blog{" +
                "noticias=" + noticias +
                '}';
    }
}
