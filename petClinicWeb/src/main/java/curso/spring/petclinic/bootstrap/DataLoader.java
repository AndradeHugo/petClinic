package curso.spring.petclinic.bootstrap;

import curso.spring.petclinic.model.Proprietario;
import curso.spring.petclinic.model.Veterinario;
import curso.spring.petclinic.services.ProprietarioService;
import curso.spring.petclinic.services.VeterinarioService;
import curso.spring.petclinic.services.map.ProprietarioServiceMap;
import curso.spring.petclinic.services.map.VeterinarioServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProprietarioService proprietarioService;
    private final VeterinarioService veterinarioService;

    public DataLoader() {
        proprietarioService = new ProprietarioServiceMap();
        veterinarioService = new VeterinarioServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Proprietario proprietario1 = new Proprietario();
        proprietario1.setId(1L);
        proprietario1.setNome("Hugo");
        proprietario1.setSobreNome("Andrade");

        proprietarioService.save(proprietario1);

        Proprietario proprietario2 = new Proprietario();
        proprietario2.setId(2L);
        proprietario2.setNome("Vanessa");
        proprietario2.setSobreNome("Sena");

        proprietarioService.save(proprietario2);

        System.out.println("Carregando proprietários...");

        Veterinario veterinario1 = new Veterinario();
        veterinario1.setId(1L);
        veterinario1.setNome("Francisco");
        veterinario1.setSobreNome("Cuoco");

        veterinarioService.save(veterinario1);

        Veterinario veterinario2 = new Veterinario();
        veterinario2.setId(2L);
        veterinario2.setNome("Otovete");
        veterinario2.setSobreNome("Rinario");

        veterinarioService.save(veterinario2);

        System.out.println("Carregando veterinários...");
    }
}
