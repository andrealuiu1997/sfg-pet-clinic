package andrea.springframework.sfgperclinic.bootstrap;

import andrea.springframework.sfgperclinic.Model.*;
import andrea.springframework.sfgperclinic.services.PetTypeService;
import andrea.springframework.sfgperclinic.services.SpecialtyService;
import andrea.springframework.sfgperclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import andrea.springframework.sfgperclinic.services.OwnerService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService owenerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    @Autowired
    public DataLoader(OwnerService owenerService, VetService vetService, PetTypeService petTypeService,
                      SpecialtyService specialtyService) {
        this.owenerService = owenerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {
        loader();
    }

    private void loader(){
        PetType dog = new PetType();
        dog.setName("dog");
        PetType saveDogPetType = petTypeService.save(dog);


        PetType cat = new PetType();
        cat.setName("cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("Brick");
        owner1.setCity("Miami");
        owner1.setTelephone("3428298382");

        Pet michaelPet = new Pet();
        michaelPet.setPetType(saveDogPetType);
        michaelPet.setOwner(owner1);
        michaelPet.setBirthaday(LocalDate.now());
        michaelPet.setName("Rosco");
        owner1.getPets().add(michaelPet);

        owenerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        owner2.setAddress("Brick");
        owner2.setCity("Miami");
        owner2.setTelephone("24214213213");

        Pet FionaPet = new Pet();
        FionaPet.setPetType(saveCatPetType);
        FionaPet.setOwner(owner2);
        FionaPet.setBirthaday(LocalDate.now());
        FionaPet.setName("Fionetta");
        owner2.getPets().add(FionaPet);

        owenerService.save(owner2);

        Speciality speciality = new Speciality();
        speciality.setDescription("dentistry");

        Speciality speciality2= new Speciality();
        speciality.setDescription("Surgery");


        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(speciality2);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Tim");
        vet2.setLastName("Coanne");
        vet2.getSpecialities().add(speciality);

        vetService.save(vet2);
    }
}
