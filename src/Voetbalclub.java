public class Voetbalclub {

    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;


    public Voetbalclub(String naam){
        this.naam = naam;


    }

        public void setName(String naam) {
        this.naam = naam;
    }

    public String getName() {
        return naam;
    }


    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public void setAantalGewonnen(int aantalGewonnen) {
        this.aantalGewonnen = aantalGewonnen;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public void setAantalGelijk(int aantalGelijk) {
        this.aantalGelijk = aantalGelijk;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

    public void setAantalVerloren(int aantalVerloren) {
        this.aantalVerloren = aantalVerloren;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            setAantalGewonnen(getAantalGewonnen() + 1);
        if (ch == 'g')
            setAantalGelijk(getAantalGelijk() + 1);
        if (ch == 'v')
            setAantalVerloren(getAantalVerloren() + 1);
    }

    public int aantalPunten(){
        int  aantal;
        aantal = this.getAantalGelijk() + this.getAantalGewonnen() * 3;
        return aantal;

    }

    public int aantalGespeeld(){
        int aantalWedstrijden;
        aantalWedstrijden = this.getAantalGelijk() + this.getAantalGewonnen()  + this.getAantalVerloren();
        return aantalWedstrijden;

    }

    public String toString(){
        return this.getName() + "  " +  this.aantalGespeeld() +  this.getAantalGewonnen()  + this.getAantalGelijk()+
                this.getAantalVerloren() + "  " + this.aantalPunten();
    }
}
