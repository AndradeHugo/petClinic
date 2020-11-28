package curso.spring.petclinic.services;

import curso.spring.petclinic.model.Proprietario;

public interface ProprietarioService extends CrudService<Proprietario, Long>{

    Proprietario findByLastName(String lastName);

}
