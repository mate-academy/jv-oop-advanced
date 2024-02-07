package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, Color color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.color = color;
        area = getArea();
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + area + " sq.units, firstSide: " + firstSide
                + " units,  second side " + secondSide + " units, color: " + color);
    }
}
