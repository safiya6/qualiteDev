package SafiyaTest;
<<<<<<< Updated upstream:src/test/SafiyaTest/VoitureTest.java
import Safiya.Voiture ;
=======

import data.Voiture ;
import org.junit.jupiter.api.BeforeEach;
>>>>>>> Stashed changes:src/test/java/SafiyaTest/VoitureTest.java
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoitureTest {
    private Voiture voitureTest;

    @BeforeEach
    public void Setup() {
        voitureTest = new Voiture();
        voitureTest.setMarque("Suzuki");
        voitureTest.setPrix(8000);

    }


    @Test
    public void TestToStringSetter(){
        assertEquals("Voiture{marque='Suzuki', prix=8000}",voitureTest.toString());


    }

    @Test
    public void TestConstrDefault(){
        Voiture voiture = new  Voiture();
        assertEquals("Voiture{marque='', prix=0}",voiture.toString());

    }
    @Test
    public void TestGetter(){
        Voiture voiture = new Voiture("Tesla",50000);
        String marque = voiture.getMarque();
        double prix = voiture.getPrix();
        assertEquals("Tesla",marque);
        assertEquals(50000,prix);



    }

}
