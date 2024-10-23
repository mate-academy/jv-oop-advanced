package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(int size, String color) {
        super(color);
        this.side = size;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(getSide(), 2) * (Math.sqrt(3) / 4);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + "sq. units, side: " + side + "units, color: " + color);

    }
}
