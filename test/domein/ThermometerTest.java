package domein;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.Before;

public class ThermometerTest
{

    private Thermometer t;

    @Before
    public void before()
    {
        t = new Thermometer();
    }

    @Test
    public void controleerDefaultConstructor()
    {
        int aantal = t.getAantalGraden();
        Assert.assertEquals(32,aantal);
    }


    @Test
    public void controleerContructor1Parameter(){
        t = new Thermometer(15);
        Assert.assertEquals(15, t.getAantalGraden());
    }
    
    @Test
    public void conversieNaarCelcius50F()
    {
        t.setAantalGraden(50);
        int conversie = t.converteerNaarCelcius();
        Assert.assertEquals(10, conversie);
    }
    
    @Test
    public void conversieNaarCelcius35F()
    {
        t.setAantalGraden(35);
        int conversie = t.converteerNaarCelcius();
        Assert.assertEquals(1, conversie);
    }
    
        @Test
    public void conversieNaarCelcius0F()
    {
        t.setAantalGraden(0);
        int conversie = t.converteerNaarCelcius();
        Assert.assertEquals(-17, conversie);
    }
}