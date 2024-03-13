//MAIN
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1,"Matheus","fmatheus09");
        Forum f1 = new Forum(12,"Forum1", "https://twitter.com/fmatheus09");
        f1.addMessage(1, "Oi pessoar", p1);
        System.out.println(f1.toString());
    }
}

//CLASSE PERSON
//As classes Person e Message são uma associação entre si, a classe Person é a parte e Message é o todo
public class Person {
    private int id;
    private String name;
    private String user;

    public Person() {
    }

    public Person(int id, String name, String user) {
        this.setId(id);
        this.setName(name);
        this.setUser(user);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}

//CLASSE MESSAGE
//As classes Person e Message são uma associação entre si, a classe Person é a parte e Message é o todo
//As classes Message e Forum são uma composição entre si, a classe Message é parte e Forum é todo.
public class Message {
    private int id;
    private String text;
    Person person; //Objeto Parte dentro do objeto Todo.

    public Message() {
    }

    public Message(int id, String text, Person person) {
        this.setId(id);
        this.setText(text);
        this.setPerson(person);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", person=" + person +
                '}';
    }
}

//CLASSE FORUM 
//As classes Message e Forum são uma composição entre si, a classe Message é parte e Forum é todo.
import java.util.ArrayList;
import java.util.List;
public class Forum {
    private int id;
    private String name;
    private String url;
    private List<Message> message;

    public Forum() {
        //alocar espaço na memória para o vetor
        this.message = new ArrayList<Message>();
    }

    public Forum(int id, String name, String url) {
        this.setId(id);
        this.setName(name);
        this.setUrl(url);
        this.message = new ArrayList<Message>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Message> getMessage() {
        return message;
    }

    public void setMessage(List<Message> message) {
        this.message = message;
    }

    //METODO PARA ADICIONAR O 'MESSAGE' NO VETOR
    //CARACTERIZA UMA COMPOSIÇÃO POIS 'MESSAGE' É CRIADO EM FUNÇÃO DE 'FORUM'
    public void addMessage(int id, String text, Person person){
        this.message.add(new Message(id, text, person));
    }

    @Override
    public String toString() {
        return "Forum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", message=" + message +
                '}';
    }
}
