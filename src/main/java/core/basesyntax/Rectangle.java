package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle \n" + "Area: " + getArea() + "\n"
                + "Color: " + color + "\n" + "First side: " + firstSide + "\n"
                + "Second side: " + secondSide);
    }
}
