package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, Color color) {
        this.type = getClass().getSimpleName();
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public void draw() {
        System.out.println("Figure: " + type + ", area: " + getArea()
                + ", side: " + side + ", color: " + color);
    }
}
