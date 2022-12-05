package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Square, "
                + "area: " + area() + " sq.units, "
                + "side: " + this.side + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
