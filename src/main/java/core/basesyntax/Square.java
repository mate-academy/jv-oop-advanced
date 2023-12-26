package core.basesyntax;

public class Square extends FigureForOther {
    public Square(String color, int a) {
        super(color, a);
    }

    @Override
    public double area() {
        return getFirstSide() * getFirstSide();
    }

    @Override
    public void fullInfo() {
        System.out.println("Figure: square, area: " + area()
                + " sq. units, side: " + getFirstSide()
                + " units, color: " + getColor());
    }
}
