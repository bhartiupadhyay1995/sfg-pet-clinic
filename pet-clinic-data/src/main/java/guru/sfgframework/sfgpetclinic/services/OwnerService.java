package guru.sfgframework.sfgpetclinic.services;

import guru.sfgframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByName(String lastName);

    Owner findByID(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
