package core.basesyntax;

public class Square extends Figure {
    private static final String name = "square";
    protected int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea()
                + "sq. units, side: " + side + " units, color " + this.getColor());
    }
}
