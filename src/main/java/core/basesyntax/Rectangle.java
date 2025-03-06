package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + calculate()
                + "sq. units, firstSide: " + firstSide
                + " units, secondSide: " + secondSide + " color: " + getColor());
    }

    @Override
    public double calculate() {
        return firstSide * secondSide;
    }
}
