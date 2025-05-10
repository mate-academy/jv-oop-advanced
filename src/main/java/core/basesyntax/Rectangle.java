package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        setColor(color);
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println(("Figure: rectangle, first side: "
                + firstSide + ", second side: "
                + secondSide + ", area: "
                + getArea() + ", color: " + getColor()));
    }
}
