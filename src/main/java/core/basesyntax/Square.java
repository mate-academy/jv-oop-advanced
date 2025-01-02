package core.basesyntax;

public class Square extends Figure implements FigureMethods {
    private final float side;

    public Square(Colors color, float side) {
        super(color, "Square");
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: "
                + area() + " sq. units, side: " + side
                + " units, color: " + getColor());
    }
}
