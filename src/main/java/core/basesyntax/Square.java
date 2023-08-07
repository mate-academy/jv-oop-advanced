package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + area() + " sq.units, side: "
                + side + " units, color: " + color.toLowerCase());
    }

    @Override
    public double area() {
        return (double) side * side;
    }
}
