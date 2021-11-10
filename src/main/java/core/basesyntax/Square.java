package core.basesyntax;

public class Square extends Figure {
    private int side;
    private String type = "Square";

    public Square(int side, String color) {
        super("Square", color);
        this.side = side;
    }

    public Square() {

    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getType() + " area: " + getArea() + " sq.units, "
                    + "side: " + side + " units, color: " + super.getColor());
    }
}
