package ro.ase.cts.Test;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.Categories.TesteUrgente;
import ro.ase.cts.Classes.Grupa;
import ro.ase.cts.Mock.StudentFake;

import static org.junit.Assert.*;

public class GrupaTestWithFake {
    @Test
    @Category(TesteUrgente.class)
    public void testGetPromovabilitate() {
        Grupa grupa = new Grupa(1086);
        for (int i = 0; i < 7; i++) {
            StudentFake studentFake = new StudentFake();
            studentFake.setValoareAreRestante(false);
            grupa.adaugaStudent(studentFake);
        }
        for (int i = 0; i < 3; i++) {
            StudentFake studentFake = new StudentFake();
            studentFake.setValoareAreRestante(true);
            grupa.adaugaStudent(studentFake);
        }

        assertEquals(0.7,grupa.getPromovabilitate(), 0.001);
    }

}