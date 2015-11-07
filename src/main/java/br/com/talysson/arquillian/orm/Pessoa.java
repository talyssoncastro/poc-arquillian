package br.com.talysson.arquillian.orm;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by talyssoncastro on 07/11/15.
 */
@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "nome", length = 60)
    private String nome;

    @Column(name = "idade")
    private Integer idade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
