
public class Cookie {
    private CookieState state;

    public Cookie(){
        this(CookieState.RAW);
    }

    public Cookie(CookieState state) {
        this.state = state;
    }
}
