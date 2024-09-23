package core.basesyntax;

public class Rectangle extends Figure {
    private final double longerSIde;
    private final double height;

    public Rectangle(double longerSIde, double height, String color) {
        super(color);
        this.longerSIde = longerSIde;
        this.height = height;
    }

    @Override
    public double getArea() {
        return longerSIde * height;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq"
                + ", longer side " + longerSIde + " units "
                + ", height: " + height + " units "
                + " color: " + color);
    }
}
