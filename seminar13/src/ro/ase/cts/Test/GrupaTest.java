package ro.ase.cts.Test;

import org.junit.Test;
import ro.ase.cts.Classes.Grupa;

import static org.junit.Assert.*;

public class GrupaTest {

    @Test
    public void testConstructorRight()
    {
        Grupa grupa=new Grupa(1086);
        assertEquals(1086,grupa.getNrGrupa());
    }

    @Test
    public void testConstructorBoundaryInf()
    {
        Grupa grupa=new Grupa(1000);
        assertEquals(1000,grupa.getNrGrupa());
    }
    @Test
    public void testConstructorBoundarySup()
    {
        Grupa grupa=new Grupa(1100);
        assertEquals(1100,grupa.getNrGrupa());
    }

    @Test(expected=IllegalArgumentException.class)
    public void testConstructorErrorConditions()
    {
        Grupa grupa=new Grupa(900);
    }
    @Test(expected=IllegalArgumentException.class)
    public void testConstructorErrorConditions2()
    {
        Grupa grupa=new Grupa(1200);
    }

    @Test(timeout=500)
    public void testConstructorPerformance()
    {
        Grupa grupa=new Grupa(1086);
    }

    @Test
    public void testConstructorExistance()
    {
        Grupa grupa=new Grupa(1034);
        assertNotNull(grupa.getStudenti());
    }
    @Test
    public void testConstructorRange(){
        Grupa grupa =new Grupa(1001) ;
        assertEquals(1001,grupa.getNrGrupa());
        Grupa grupa2 =new Grupa(1099) ;
        assertEquals(1099,grupa2.getNrGrupa());
    }

}