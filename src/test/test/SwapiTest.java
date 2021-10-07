import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SwapiTest {

    @Test
    public void verifyResponseCode() {
        Swapi swapi = new Swapi();
        Assert.assertTrue("Response code does not mach", swapi.hasResponseCode(200));
    }

    @Test
    public void verifyNumberOfPeopleHeight(){
        Swapi swapi = new Swapi();
        Assert.assertTrue("Number of people does not match",swapi.hasNumberOfPeopleHeight(1,200));
    }

    @Test
    public void verifyIndividualsName(){
        Swapi swapi = new Swapi();
        String[] individualNames = new String[] { "Darth Vader", "Luke Skywalker", "C-3PO","R2-D2", "Leia Organa","Owen Lars",
                                                "Beru Whitesun lars","R5-D4","Biggs Darklighter", "Obi-Wan Kenobi"};

        Assert.assertTrue(swapi.hasIndividualsNames(individualNames));
    }

    @Test
    public void verifyNumberOfPeopleChecked(){
        Swapi swapi = new Swapi();
        Assert.assertTrue(swapi.hasNumberOfPeopleChecked(82));
    }

}
