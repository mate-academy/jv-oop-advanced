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
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea() + " sq.units, first side: "
                           + firstSide + " units, second side: " + secondSide + "units, color: "
                           + getColor());
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }
}
