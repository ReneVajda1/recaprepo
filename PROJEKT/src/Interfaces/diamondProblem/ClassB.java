package Interfaces.diamondProblem;

public class ClassB implements InterfaceA {

    private int x;

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void calculateX() {
        x = 10;
    }


}
