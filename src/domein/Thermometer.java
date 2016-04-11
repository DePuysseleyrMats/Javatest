
package domein;

public class Thermometer {
    
    private int aantalGraden;

    public int getAantalGraden() {
        return aantalGraden;
    }

    public void setAantalGraden(int aantalGraden) {
        stelAantalgradenIn(aantalGraden);
    }
    
    private void stelAantalgradenIn(int aantalGraden){
        if(aantalGraden< 14 || aantalGraden > 104)
                throw new IllegalArgumentException("Getal moet tussen 14 en 104 liggen");
            
        this.aantalGraden = aantalGraden;
        
    }
    
    
    public Thermometer()
    {
        super();
        stelAantalgradenIn(32);
    }
    
    public Thermometer(int aantalGraden)
    {
        super();
        stelAantalgradenIn(aantalGraden);
    }
    
    public int converteerNaarCelcius(){
        return (aantalGraden - 32) * 5/9;
    }
    
}
