package homeWorkTask2;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class morsTest {

    //Utveckla programmet i TDD och skriv minst 3 JUnit-testfall

    @Test
    public void TestGetEngToMos(){

        morsCode engToMos = new morsCode();

        String expected = "";
        String actual = engToMos.getMos();

        assertEquals(expected,actual);
    }
    @Test
    public void TestGetEngToMos2(){

        morsCode engToMos = new morsCode();
        engToMos.setText("H");

        String expected = "**** ";
        String actual = engToMos.getMos();

        assertEquals(expected,actual);
    }
    @Test
    public void TestGetEngToMos3(){

        morsCode engToMos = new morsCode();
        engToMos.setText("L");

        String expected = "*-** ";
        String actual = engToMos.getMos();

        assertEquals(expected,actual);
    }
    @Test
    public void TestGetEngToMos4(){

        morsCode engToMos = new morsCode();
        engToMos.setText("h");

        String expected = "**** ";
        String actual = engToMos.getMos();

        assertEquals(expected,actual);
    }
    @Test
    public void TestGetEngToMos5(){

        morsCode engToMos = new morsCode();
        engToMos.setText("****");

        String expected = "H";
        String actual = engToMos.getEng();

        assertEquals(expected,actual);
    }
    @Test
    public void TestGetEngToMos6(){

        morsCode engToMos = new morsCode();
        engToMos.setText("HEJ");

        String expected = "**** * *--- ";
        String actual = engToMos.getMos();

        assertEquals(expected,actual);
    }
    @Test
    public void TestGetEngToMos7(){

        morsCode engToMos = new morsCode();
        engToMos.setText("**** * *--- ");

        String expected = "HEJ";
                String actual = engToMos.getEng();

        assertEquals(expected,actual);
    }
}