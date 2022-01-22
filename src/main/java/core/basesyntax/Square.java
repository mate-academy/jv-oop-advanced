package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Drawable {
    private double side;
    private String color;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        color = colorSupplier.getRandomColor();
        return color;
    }

    @Override
    public String draw() {
        return "Figure: square. Side: " + side + " mm. Area: " + getArea() + " sq.mm. Color: "
                + color;
    }
}
