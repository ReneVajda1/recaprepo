import Interfaces.cohort.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JohnTheCloneExistenceTested {

    @Test
    public void johnDoesExist(){
        Student sut = new Student();
        Assertions.assertEquals(1,1);
    }
}
