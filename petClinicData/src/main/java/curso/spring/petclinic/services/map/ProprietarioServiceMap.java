package curso.spring.petclinic.services.map;

import curso.spring.petclinic.model.Proprietario;
import curso.spring.petclinic.services.CrudService;

import java.util.Set;

public class ProprietarioServiceMap extends AbstractServiceMap<Proprietario, Long> implements CrudService<Proprietario, Long> {

    @Override
    public Set<Proprietario> findAll() {
        return super.findAll();
    }

    @Override
    public Proprietario findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Proprietario save(Proprietario proprietario) {
        return super.save(proprietario.getId(), proprietario);
    }

    @Override
    public void delete(Proprietario proprietario) {
        super.delete(proprietario);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
