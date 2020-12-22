package curso.spring.petclinic.services.map;

import curso.spring.petclinic.model.Veterinario;
import curso.spring.petclinic.services.VeterinarioService;

import java.util.Set;

public class VeterinarioServiceMap extends AbstractServiceMap<Veterinario, Long> implements VeterinarioService {

    @Override
    public Set<Veterinario> findAll() {
        return super.findAll();
    }

    @Override
    public Veterinario findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Veterinario save(Veterinario veterinario) {
        return super.save(veterinario.getId(), veterinario);
    }

    @Override
    public void delete(Veterinario veterinario) {
        super.delete(veterinario);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
