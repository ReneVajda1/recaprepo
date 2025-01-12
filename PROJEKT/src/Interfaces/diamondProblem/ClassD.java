package Interfaces.diamondProblem;
public class ClassD implements InterfaceC,InterfaceB{
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();

    public void calculateBoth(){
        b.calculateX();
        c.calculateX();
    }
    public int getXFromB(){
        return b.getX();
    }

    public int getXfromC(){
        return c.getX();
    }

    public void displayValues(){
        System.out.println("Value of x from B is >>>> " + getXFromB());
        System.out.println("Value of x from C is >>>> " + getXfromC());
    }

    @Override
    public int getX() {
        throw new UnsupportedOperationException("Ambiguous call: use getXFromB() or getXFromC");
    }

    @Override
    public void calculateX() {
        throw new UnsupportedOperationException("Ambigous call: use calculateBoth()");
    }
}
