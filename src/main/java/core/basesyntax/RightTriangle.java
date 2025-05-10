package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, area: " + getArea()
                + " sq.units, side: " + side + " units, color: " + getColor());

    }

    @Override
    public double getArea() {
        return side * side * (Math.sqrt(3) / 4);
    }
}
