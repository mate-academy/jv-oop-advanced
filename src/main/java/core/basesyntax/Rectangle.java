package core.basesyntax;

public class Rectangle extends Figure{
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double area() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + area() + " sq.units, firstSide: "
                + firstSide + " units, secondSide: " + secondSide + " units, color: " + color);
    }
}
