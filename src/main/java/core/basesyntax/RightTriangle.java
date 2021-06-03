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

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
        calculateArea();
    }

    public double getSecondSide() {
        return secondSide;

    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
        calculateArea();
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
        calculateArea();

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
