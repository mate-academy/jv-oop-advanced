package core.basesyntax;

public class Rectangle extends RandomFigure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.color = color;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Loading a Rectangle \n" + "Area: " + getArea() + "\n"
                + "Color: " + color + "\n" + "First side: " + firstSide + "\n"
                + "Second side: " + secondSide);
    }
}
