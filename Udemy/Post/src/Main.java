import entities.Coments;
import entities.Post;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Post p1 = new Post(Date.from(Instant.now()), "Viajando para o Japão", "Fazendo minha primeira viagem para o exterior!", 31);
        Coments c1 = new Coments("Coisa boa!");
        Coments c2 = new Coments("Vambora!!");
        p1.addComment(c1);
        p1.addComment(c2);
        System.out.println(p1.toString());
    }
}