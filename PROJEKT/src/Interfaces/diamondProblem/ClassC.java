package Interfaces.diamondProblem;

public class ClassC implements InterfaceC {
    public int x;
    @Override
    public int getX() {
        return x;
    }

    @Override
    public void calculateX() {
        x = 20;
    }
}
