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
    public double calculateArea() {
        return longerSide * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea() + " sq"
                + ", longer side " + longerSide + " units "
                + ", height: " + height + " units "
                + " color: " + color);
    }
}
