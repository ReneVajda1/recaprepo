
import UnitTesting.cookieExercise.Cookie;
import UnitTesting.cookieExercise.CookieState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CookieTest {

    @Test
    public void cookieShouldBeCreated(){
    Cookie sut = new Cookie(); // System Under Test sut
        Assertions.assertNotEquals(sut,null);
    }
    @Test
    public void cookieShouldBeCreatedWithRAWState(){
        Cookie sut = new Cookie();
        Assertions.assertEquals(sut.getState(), CookieState.RAW);
    }
    @Test
    public void cookieShouldChangeStateIfWeCallSetState(){
        //AAA       3 things test should do

        // Arrange
        Cookie sut = new Cookie();
        // Act
        sut.bake();
        // Assert
        Assertions.assertEquals(sut.getState(), CookieState.IN_PROGRESS);


//        sut.bake();
//        Assertions.assertNotEquals(sut.getState(),CookieState.RAW);
//        Assertions.assertEquals(sut.getState(),CookieState.IN_PROGRESS);
//        sut.bake();
//        Assertions.assertNotEquals(sut.getState(),CookieState.IN_PROGRESS);
//        Assertions.assertEquals(sut.getState(),CookieState.RAW);
//        Assertions.assertEquals(sut.getState(),CookieState.DONE);

    }
    @Test
    public void cookieShouldBeDoneIfWeCallBakeTwice(){
        //AAA       3 things test should do

        // Arrange
        Cookie sut = new Cookie();
        // Act
        sut.bake();
        sut.bake();
        // Assert
        Assertions.assertEquals(sut.getState(), CookieState.DONE);



    }

}