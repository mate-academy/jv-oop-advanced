package core.basesyntax;

public class Rectangle extends FigureForOther {
    public Rectangle(String color, int a, int b) {
        super(color, a, b);
    }

    @Override
    public double calculatorArea() {
        return getFirstSide() * getSecondSide();
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + calculatorArea() + "sq. units, first side: " + getFirstSide()
                + " units, second side: " + getSecondSide()
                + " color: " + getColor());
    }
}
