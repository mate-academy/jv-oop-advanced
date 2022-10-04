package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstSide;
    private double secondSide;
    private double hypotenuse;

    public RightTriangle(String color, double firstSide, double secondSide) {
        setColor(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.hypotenuse = Math.sqrt(Math.pow(firstSide, 2) + Math.pow(secondSide, 2));
    }

    @Override
    public double calculateArea() {
        return 0.5 * firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + " sq.units, firstSide: " + firstSide
                + " units, secondSide: " + secondSide
                + " units, hypotenuse:" + hypotenuse
                + " color: " + getColor());
    }
}
