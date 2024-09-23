package core.basesyntax;

public class Rectangle extends Figure {
    private final double longerSide;
    private final double height;

    public Rectangle(double longerSide, double height, String color) {
        super(color);
        this.longerSide = longerSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return longerSide * height;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq"
                + ", longer side " + longerSide + " units "
                + ", height: " + height + " units "
                + " color: " + color);
    }
}
