package model.excepions;

public class DomainException extends Exception {
    private static final long serialVersionUID = 1L;

    public DomainException(String mensagem){
        super(mensagem);
    }
}
