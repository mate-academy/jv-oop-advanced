package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;
    private String color = String.valueOf(ColorSupplier.getRandomColor());

    public RightTriangle(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side * ((Math.sqrt(3)) / 4);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq.units , side " + side + " units, color: " + color);
    }
}
