package core.basesyntax;

public abstract class Figure implements AreaCalc, Draw{
    String color;

    public Figure() {
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("message");
    }
}
