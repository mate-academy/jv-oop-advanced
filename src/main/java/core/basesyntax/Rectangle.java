package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;
    private double area;

    public Rectangle(double firstSide, double secondSide, Color color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.setColor(color);
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea()
                + " sq.units, first side: " + firstSide + "units, second side: " + secondSide
                + "units, color: " + getColor());
    }
}
