package core.basesyntax.figures;

public class Rectangle extends Figure {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle\nColor: " + getColor() + "\nArea: " + getArea()
                + "\nFirst side: " + firstSide + "\nSecond side: " + secondSide);
    }

    @Override
    public double getArea() {
        return 2 * (firstSide + secondSide);
    }
}
