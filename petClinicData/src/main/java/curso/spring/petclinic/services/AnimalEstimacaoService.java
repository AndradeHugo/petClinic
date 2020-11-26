package curso.spring.petclinic.services;

import curso.spring.petclinic.model.AnimalEstimacao;

import java.util.Set;

public interface AnimalEstimacaoService {

    AnimalEstimacao findBy(Long id);

    AnimalEstimacao save(AnimalEstimacao animalEstimacao);

    Set<AnimalEstimacao> findAll();

}
