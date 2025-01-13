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
    private void setState(CookieState state) {
        this.state = state;
    }

    public void bake(){
        if (this.getState() == CookieState.RAW){
            this.setState(CookieState.IN_PROGRESS);
        } else if (this.getState().equals(CookieState.IN_PROGRESS)) {
            this.setState(CookieState.DONE);
        } else {
            this.setState(CookieState.DONE);
        }
    }
}
