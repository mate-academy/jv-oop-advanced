package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(String color, int side) {
        super("right triangle", color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return ((this.side * this.side) * Math.sqrt(3)) / 4;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq. units, side length: "
                + getSide() + " units, color: "
                + getColor());
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
