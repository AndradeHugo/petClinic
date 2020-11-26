package curso.spring.petclinic.services;

import curso.spring.petclinic.model.Veterinario;

import java.util.Set;

public interface VeterinarioService {

    Veterinario findBy(Long id);

    Veterinario save(Veterinario veterinario);

    Set<Veterinario> findAll();

}
