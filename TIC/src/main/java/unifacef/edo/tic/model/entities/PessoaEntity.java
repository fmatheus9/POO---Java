package unifacef.edo.tic.model.entities;

import jakarta.persistence.*;
@Entity
@Table(name="tb_pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PessoaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected Long id;

    @Column(name = "cpf")
    protected String cpf;

    @Column(name = "nome")
    protected String nome;

    @Column(name = "endereco")
    protected String endereco;

    @Column(name = "telefone")
    protected String telefone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
