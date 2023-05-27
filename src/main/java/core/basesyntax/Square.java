package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        String name = "square";
        System.out.println("Figure: " + name + ", area: " + getArea()
                + " sq. units, side: " + side + " units, color: " + getColor().toLowerCase());
    }
}
