package SafiyaTest;
import Services.Service;
import data.Voiture ;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {

    private Service service ;

    @BeforeEach
    void setup(){
        Voiture voiture11 = new Voiture ("Toyota", 10000);
        Voiture voiture1 = new Voiture ("seat", 25000);
        Voiture voiture2 = new Voiture ("Renault", 15000);
        Voiture voiture3 = new Voiture ("Opel", 17000);
        Voiture voiture4 = new Voiture ("Citroen", 12000);
        Voiture voiture5 = new Voiture ("Volkswagen", 20000);
        Voiture voiture6 = new Voiture ("Audi", 75000);
        ArrayList<Voiture> listeVoiture = new ArrayList();
        service= new Service(listeVoiture);
        service.ajouter(voiture11);
        service.ajouter(voiture1);
        service.ajouter(voiture2);
        service.ajouter(voiture3);
        service.ajouter(voiture4);
        service.ajouter(voiture5);
        service.ajouter(voiture6);

    }
    @Test
    void testPrix() {
        int Prix = 170050; // calculate the expected price with one discount
        assertEquals(Prix, service.prix());
    }
}



