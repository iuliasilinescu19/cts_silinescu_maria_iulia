package ro.ase.cts.Tests;

import org.junit.Test;
import ro.ase.cts.Class.Student;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void setNume()
    {
        String nume="Popescu";
        Student student=new Student();
        student.setNume(nume);
        assertEquals(nume,student.getNume());
    }

    @Test
    public void testDefaultConstructorWorksCorrectly(){
        Student student=new Student();
        //Ar trebui testati ambii constructori, dar testam unul
        assertNotNull("Lista cu notele nu a fost initializata",student.getNote());
        assertNotNull("Numele nu a fost initializat",student.getNume());
    }

    @Test
    public void testAdaugaNota()
    {
        //noi ne am creat obiectul exact aici
        //ma intereseaza sa aiba nota 10 pe prima poz
        Student student=new Student();
        int nota=10;
        student.adaugaNota(nota);
        assertEquals(nota,student.getNota(0));
    }

    @Test
    public void testGetNota()
    {
        Student student=new Student();
        student.adaugaNota(5);
        student.adaugaNota(7);
        student.adaugaNota(9);
        student.adaugaNota(4);
        assertEquals(9,student.getNota(2));
    }

    @Test
    public void testAdaugaOSinguraNota()
    {
        Student student=new Student();
        int nota=10;
        student.adaugaNota(nota);
        assertEquals(1,student.getNote().size());
    }

    @Test
    public void testAdaugaNotaGresita()
    {
        Student student=new Student();
        try {
            int nota = -100;
            student.adaugaNota(nota);
            fail("nu trebuia sa ajunga aici. Metoda nu arunca exceptii");
        }
        catch(IllegalArgumentException ex) {
        }
        catch(Exception ex){
            fail("Nu arunca exceptia potrivita.");
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdaugaNotaIncorectaJunit4()
    {
        Student student=new Student();
        student.adaugaNota(-1);
    }
    @Test
    public void testStudentArerestanta()
    {
        Student student=new Student();
        student.adaugaNota(3);
        Boolean rezultat=student.areRestante();
        assertTrue(rezultat);
    }
    @Test
    public void testStudenNutArerestanta()
    {
        Student student=new Student();
        student.adaugaNota(6);
        Boolean rezultat=student.areRestante();
        assertFalse(rezultat);
    }
    @Test
    public void testCalculeazaMedieCorecta()
    {
        Student student=new Student();
        student.adaugaNota(10);
        student.adaugaNota(7);
        //cand avem valori reale nu ne permite assertEquals (9,5 s-ar putea sa nu fie exact 9.4449 ->are o abatare)
        //assertEquals(8.5,student.calculeazaMedie());
        assertEquals(8.5,student.calculeazaMedie(),0.01);
    }
}