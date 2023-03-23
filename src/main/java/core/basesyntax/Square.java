package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Square extends Figure implements Area, Draw {
    private final double side;

    public Square(double side) {
        this.type = getClass().getSimpleName();
        this.side = side;
        this.color = ColorSupplier.getRandomColor();
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
