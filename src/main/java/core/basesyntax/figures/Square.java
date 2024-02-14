package core.basesyntax.figures;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + this.calculateArea() + " side " + getSide()
                + ", color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
