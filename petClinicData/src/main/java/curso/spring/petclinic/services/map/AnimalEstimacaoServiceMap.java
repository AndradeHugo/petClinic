package curso.spring.petclinic.services.map;

import curso.spring.petclinic.model.AnimalEstimacao;
import curso.spring.petclinic.services.AnimalEstimacaoService;

import java.util.Set;

public class AnimalEstimacaoServiceMap extends AbstractServiceMap<AnimalEstimacao, Long> implements AnimalEstimacaoService {

    @Override
    public Set<AnimalEstimacao> findAll() {
        return super.findAll();
    }

    @Override
    public AnimalEstimacao findById(Long id) {
        return super.findById(id);
    }

    @Override
    public AnimalEstimacao save(AnimalEstimacao animalEstimacao) {
        return super.save(animalEstimacao.getId(), animalEstimacao);
    }

    @Override
    public void delete(AnimalEstimacao animalEstimacao) {
        super.delete(animalEstimacao);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
