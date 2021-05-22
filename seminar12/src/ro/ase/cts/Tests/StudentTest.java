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

}