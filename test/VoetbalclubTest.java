import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {

    Voetbalclub ajx = new Voetbalclub("Ajax      ");
    Voetbalclub feij = new Voetbalclub("Feijenoord");

    @BeforeEach
    void setUp() {
        System.out.println("__init__");
    }
    @Test
    void setNameTest() {
        System.out.println("setNameTest");
        Voetbalclub ajx = new Voetbalclub("Ajax      ");
        assertEquals("Ajax      ", ajx.getName());
    }
    @Test
        void set_EMPTY_NameTest() {
        System.out.println("setNameTest()");
        Voetbalclub empty = new Voetbalclub("");
        assertEquals("FC", ajx.getName(),"When club-name is empty, use 'FC' ");
    }

    @Test
    void getNameTest() {
        System.out.println("getNameTest()");
        System.out.println(ajx.getName());
        assertEquals("Ajax      ", ajx.getName());
    }

    @Test
    void verwerkResultaatTest() {
        System.out.println("verwerkResultaatTest()");
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');
        feij.verwerkResultaat('v');
        System.out.println(feij);
        assertEquals("Feijenoord  3111  4",feij.toString(),"Eis: herhaaldelijk verwerken van deze resultaten moet zorgen voor een correcte optelling van wedstrijdaantallen en punten.\n");
    }

    @Test
    void getAantalGewonnenTest() {
        System.out.println("getAantalGewonnenTest()");
            feij.verwerkResultaat('w');
                System.out.println(feij.getAantalGewonnen());
                        assertEquals(1,feij.getAantalGewonnen());
    }
    @Test
    void getAantalGewonnenPuntenTest() {
        System.out.println("getAantalGewonnenPuntenTest()");
            feij.verwerkResultaat('w');
                System.out.println(feij.aantalPunten());
                        assertEquals(3,feij.aantalPunten(),"punten per win kloppen niet");
    }
    @Test
    void getAantalGewonnenGespeeldTest() {
        System.out.println("getAantalGewonnenGespeeldTest()");
            feij.verwerkResultaat('w');
                System.out.println(feij.aantalPunten());
                        assertEquals(1,feij.aantalGespeeld(),"aantalGespeeld per win kloppen niet");
    }


    @Test
    void getAantalGelijkTest() {
        System.out.println("getAantalGelijkTest()");
            feij.verwerkResultaat('g');
                System.out.println(feij.getAantalGelijk());
                        assertEquals(1,feij.getAantalGelijk());
    }

        @Test
    void getAantalGelijkPuntenTest() {
        System.out.println("getAantalGelijkPuntenTest()");
            feij.verwerkResultaat('g');
                System.out.println(feij.aantalPunten());
                        assertEquals(1,feij.aantalPunten(),"punten per Gelijk kloppen niet");
    }
    @Test
    void getAantalGelijkGespeeldTest() {
        System.out.println("getAantalGelijkGespeeldTest()");
            feij.verwerkResultaat('g');
                System.out.println(feij.aantalPunten());
                        assertEquals(1,feij.aantalGespeeld(),"aantalGespeeld per Gelijk kloppen niet");
    }


    @Test
    void getAantalVerlorenTest() {
        System.out.println("getAantalVerlorenTest()");
            feij.verwerkResultaat('v');
                System.out.println(feij.getAantalVerloren());
                        assertEquals(1,feij.getAantalVerloren());
    }


        @Test
    void getAantalVerlorenPuntenTest() {
        System.out.println("getAantalVerlorenPuntenTest()");
            feij.verwerkResultaat('v');
                System.out.println(feij.aantalPunten());
                        assertEquals(0,feij.aantalPunten(),"punten per Verloren kloppen niet");
    }
    @Test
    void getAantalVerlorenGespeeldTest() {
        System.out.println("getAantalVerlorenGespeeldTest()");
            feij.verwerkResultaat('v');
                System.out.println(feij.aantalPunten());
                        assertEquals(1,feij.aantalGespeeld(),"aantalGespeeld per Verloren kloppen niet");
    }

    @Test
    void testToStringTest() {
        System.out.println("testToStringTest()");
        assertEquals("Feijenoord  0000  0",feij.toString());
    }
}