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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
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
        returnOwner = Owner.builder()
                .id(1l)
                .lastName(LAST_NAME)
                .build();

    }

    @Test
    void findByLastName() {
        // given
        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);

        // when
        Owner smith = service.findByLastName(LAST_NAME);

        // then
        assertEquals(LAST_NAME, smith.getLastName());
    }

    @Test
    void getAll() {

    }

    @Test
    void getById() {
    }

    @Test
    void create() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}