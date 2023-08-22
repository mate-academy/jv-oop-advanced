package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;
    private double height;

    public RightTriangle(double side, double height, String color) {
        super(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (side * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: " + (int) calculateArea()
                + " sq.units, sideLength: " + (int) side + " units, heightLength: "
                + (int) height + " units, color: " + getColor());
    }
}
