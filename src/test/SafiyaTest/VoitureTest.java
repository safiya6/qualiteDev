package SafiyaTest;
import Safiya.Voiture ;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoitureTest {

    @Test
    public void TestToString(){
        Voiture voiture = new Voiture ("Toyota", 10000);
        assertEquals("Voiture{marque='Toyota', prix=10000}",voiture.toString());


    }

}
