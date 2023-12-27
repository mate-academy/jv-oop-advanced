package core.basesyntax;

public class Rectangle extends Figure {
    public Rectangle(String color, int a, int b) {
        super(color, a, b);
    }

    @Override
    public double calculateArea() {
        return getFirstSide() * getSecondSide();
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + calculateArea() + "sq. units, first side: " + getFirstSide()
                + " units, second side: " + getSecondSide()
                + " color: " + getColor());
    }
}
