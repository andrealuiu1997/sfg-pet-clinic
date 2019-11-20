package andrea.springframework.sfgperclinic.bootstrap;

import andrea.springframework.sfgperclinic.Model.Owner;
import andrea.springframework.sfgperclinic.Model.Vet;
import andrea.springframework.sfgperclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import andrea.springframework.sfgperclinic.services.OwnerService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService owenerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService owenerService, VetService vetService) {
        this.owenerService = owenerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        owenerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        owenerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Tim");
        vet2.setLastName("Coanne");

        vetService.save(vet2);

    }
}
