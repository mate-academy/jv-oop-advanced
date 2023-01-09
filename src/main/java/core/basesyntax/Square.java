package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        this.side = side;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square"
                + ", color: " + getColor().toLowerCase() + ", area: "
                + String.format("%.2f", getArea()) + ", side: "
                + side + " units");
    }
}
