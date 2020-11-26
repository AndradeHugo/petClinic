package curso.spring.petclinic.model;

import lombok.Data;

@Data
public class Pessoa extends EntidadeBase {

    private String nome;
    private String sobreNome;

}
