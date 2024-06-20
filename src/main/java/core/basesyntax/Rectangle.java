package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("\nFigure: Rectangle, "
                + "area: "
                + String.format("%.2f", getArea())
                + " units, firstLeg: "
                + firstSide
                + " units, secondLeg: "
                + secondSide
                + " units, color: "
                + getColor());
    }
}
