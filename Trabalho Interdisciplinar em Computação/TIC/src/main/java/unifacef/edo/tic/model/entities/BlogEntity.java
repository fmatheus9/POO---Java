package unifacef.edo.tic.model.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_blog")
public class BlogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToMany(mappedBy = "blog", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<NoticiaEntity> noticias = new ArrayList<NoticiaEntity>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<NoticiaEntity> getNoticias() {
        return noticias;
    }

    public void setNoticias(List<NoticiaEntity> noticias) {
        this.noticias = noticias;
    }
}
