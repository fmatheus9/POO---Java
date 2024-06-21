package unifacef.edo.tic.model.DTOs;

import unifacef.edo.tic.model.entities.NoticiaEntity;

import java.util.ArrayList;
import java.util.List;

public class BlogDTO {
    private Long id;
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
