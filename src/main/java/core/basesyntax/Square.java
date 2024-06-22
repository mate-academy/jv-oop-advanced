package core.basesyntax;

public class Square extends Figure {
    public static final String SHAPE_NAME = "square";
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + SHAPE_NAME + " , area: "
                + getArea() + " sq. units, side: "
                + this.side + " units, color: " + getColor());
    }
}
