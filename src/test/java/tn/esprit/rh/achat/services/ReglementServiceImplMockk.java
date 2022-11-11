package tn.esprit.rh.achat.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.rh.achat.entities.Reglement;
import tn.esprit.rh.achat.repositories.ReglementRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
public class ReglementServiceImplMockk {



    @Mock
    ReglementRepository reglementRepository;
    @InjectMocks
    ReglementServiceImpl  reglementService;

    Reglement reglement = new Reglement(44, 33, true, new Date());
    List<Reglement> listUsers = new ArrayList<Reglement>() {
        {
            add(new Reglement(323, 123, true, new Date()));
            add(new Reglement(213, 112,false, new Date()));
        }
    };
    @Test
    public void retrieveReglement() {
        Mockito.when(reglementRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(reglement));
        Reglement reglement1 = reglementService.retrieveReglement(Long.valueOf("3"));
        Assertions.assertNotNull(reglement1);
    }

}