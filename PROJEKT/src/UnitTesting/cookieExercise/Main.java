package UnitTesting.cookieExercise;

public class Main {
    public static void main(String[] args) {
        Cookie cookie = new Cookie();

        System.out.println("Initial state: " + cookie.getState()); // RAW

        cookie.bake();
        System.out.println("After first bake: " + cookie.getState()); // IN_PROGRESS

        cookie.bake();
        System.out.println("After second bake: " + cookie.getState()); // DONE

        cookie.bake();
        System.out.println("After third bake: " + cookie.getState()); // DONE

    }
}
