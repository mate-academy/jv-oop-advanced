package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("\nFigure: Rectangle, "
                + "area: "
                + getArea()
                + " units, firstLeg: "
                + firstSide
                + " units, secondLeg: "
                + firstSide
                + " units, color: "
                + getColor());
    }

    @Override
    public String getColor() {
        return color;
    }
}
