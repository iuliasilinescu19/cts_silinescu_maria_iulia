package ro.ase.cts.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.Test.GrupaTest;
import ro.ase.cts.Test.GrupaTestStub;
import ro.ase.cts.Test.GrupaTestWithFake;
import ro.ase.cts.Test.GrupaTestWithMock;

@RunWith(Suite.class)
@Suite.SuiteClasses({GrupaTest.class, GrupaTestWithFake.class, GrupaTestWithMock.class, GrupaTestStub.class})
public class CompleteTestSuite {

}
