package core.basesyntax;

public class Rectangle extends FigureForOther {
    public Rectangle(String color, int a, int b) {
        super(color, a, b);
    }

    @Override
    public double area() {
        return getFirstSide() * getSecondSide();
    }

    @Override
    public void fullInfo() {
        System.out.println("Figure: rectangle, area: "
                + area() + "sq. units, first side: " + getFirstSide()
                + " units, second side: " + getSecondSide()
                + " color: " + getColor());
    }
}
