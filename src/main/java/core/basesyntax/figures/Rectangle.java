package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
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
        System.out.println("Figure: rectangle,\n area: " + getArea()
                + "\nFirst side: " + firstSide
                + "\nSecond side: " + secondSide
                + "\ncolor: " + color);
    }
}
