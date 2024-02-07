package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, Color color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "square" + ", area: " + calculateArea()
                + ", side: " + getSide() + ", color: " + getColor());
    }
}
