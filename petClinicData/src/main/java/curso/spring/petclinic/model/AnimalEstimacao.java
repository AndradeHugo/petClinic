package curso.spring.petclinic.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AnimalEstimacao extends EntidadeBase {

    private TipoAnimal tipoAnimal;
    private Proprietario proprietario;
    private LocalDate dataNascimento;

}
