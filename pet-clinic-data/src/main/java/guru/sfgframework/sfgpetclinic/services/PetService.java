package guru.sfgframework.sfgpetclinic.services;
import guru.sfgframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {


    Pet findByID(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
