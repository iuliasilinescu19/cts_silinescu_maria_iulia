package ro.ase.cts.Test;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.Categories.TesteRight;
import ro.ase.cts.Categories.TesteUrgente;
import ro.ase.cts.Classes.Grupa;
import ro.ase.cts.Mock.StudentStub;

import static org.junit.Assert.*;

public class GrupaTestStub {
    @Test
    @Category({TesteRight.class, TesteUrgente.class})
    public void testGetPromovabilitateRight()
    {
        Grupa grupa=new Grupa(1086);
        StudentStub studentStub=new StudentStub();
        grupa.adaugaStudent(studentStub);
        assertEquals(0,grupa.getPromovabilitate(),0.01);
    }

}