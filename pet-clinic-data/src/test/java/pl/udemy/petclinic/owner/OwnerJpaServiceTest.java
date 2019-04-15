package pl.udemy.petclinic.owner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.udemy.petclinic.owner.model.OwnerRepository;
import pl.udemy.petclinic.owner.model.jpa.Owner;
import pl.udemy.petclinic.pet.PetService;
import pl.udemy.petclinic.pet.PetTypeService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OwnerJpaServiceTest {

    public static final String LAST_NAME = "Smith";

    @Mock
    private OwnerRepository ownerRepository;

    @Mock
    private PetService petService;

    @Mock
    private PetTypeService petTypeService;

    @InjectMocks
    private OwnerJpaService service;

    private Owner returnOwner;

    @BeforeEach
    void setUp() {
        returnOwner = Owner.builder().id(1l).lastName(LAST_NAME).build();
    }

    @Test
    void findByLastName() {
        // given
        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);

        // when
        Owner smith = service.findByLastName(LAST_NAME);

        // then
        assertEquals(LAST_NAME, smith.getLastName());
        verify(ownerRepository).findByLastName(any());
    }

    @Test
    void getAll() {
        Set<Owner> returnOwnersSet = new HashSet<>();
        returnOwnersSet.add(Owner.builder().id(1l).build());
        returnOwnersSet.add(Owner.builder().id(2l).build());

        when(ownerRepository.findAll()).thenReturn(returnOwnersSet);

        Set<Owner> owners = service.getAll();

        assertNotNull(owners);
        assertEquals(2, owners.size());
    }

    @Test
    void getById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));

        Owner owner = service.getById(1L);

        assertNotNull(owner);
    }

    @Test
    void create() {
        Owner ownerToCreate = Owner.builder().id(1L).build();
        when(ownerRepository.save(any())).thenReturn(returnOwner);

        Owner createdOwner = service.create(ownerToCreate);

        assertNotNull(createdOwner);
    }

    @Test
    void delete() {
        service.delete(returnOwner);

        verify(ownerRepository).delete(any());
    }

    @Test
    void deleteById() {
        Long ownerId = returnOwner.getId();
        service.deleteById(ownerId);

        verify(ownerRepository).deleteById(ownerId);
    }
}