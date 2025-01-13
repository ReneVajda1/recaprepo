
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
        Cookie sut = new Cookie();
        Assertions.assertEquals(sut.getState(), CookieState.RAW);
        sut.setState(CookieState.IN_PROGRESS);
        Assertions.assertNotEquals(sut.getState(),CookieState.RAW);
    }

}