package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;
    private double height;

    public RightTriangle(String color, double side, double height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return side * height / 2;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: triangle, area: "
                + calculateArea() + " sq.units, side: " + side
                + " units, height: " + height + " units, color: " + getColor());
    }
}

