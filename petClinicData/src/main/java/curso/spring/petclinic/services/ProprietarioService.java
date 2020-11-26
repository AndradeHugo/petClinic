package curso.spring.petclinic.services;

import curso.spring.petclinic.model.Proprietario;

import java.util.Set;

public interface ProprietarioService {

    Proprietario findByLastName(String lastName);

    Proprietario findBy(Long id);

    Proprietario save(Proprietario proprietario);

    Set<Proprietario> findAll();

}
