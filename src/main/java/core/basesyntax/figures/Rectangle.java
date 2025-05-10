package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.print("\nType: rectangle"
                + "\nFirst side: " + firstSide
                + "\nSecond side: " + secondSide
                + "\n Area: " + getArea()
                + "\nColor: " + getColor()
                + "\n-----------");
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
