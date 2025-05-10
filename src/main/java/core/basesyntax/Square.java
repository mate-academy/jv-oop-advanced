package core.basesyntax;

public class Square extends Figure {
    protected int side;

    public Square(int side, String name, String color) {
        super(color, name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getName() + ", area: " + getArea()
                + "sq. units, side: " + side + " units, color " + this.getColor());
    }
}
