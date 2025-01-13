package UnitTesting.cookieExercise;

public class Cookie {
    private CookieState state;

    public Cookie(){
        this(CookieState.RAW);
    }

    public Cookie(CookieState state) {
        this.state = state;
    }

    public CookieState getState() {
        return state;
    }
    public void setState(CookieState state) {
        this.state = state;
    }
}
