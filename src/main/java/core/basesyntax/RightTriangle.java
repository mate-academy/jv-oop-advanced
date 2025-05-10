package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * (side * side);
    }

    @Override
    public void draw() {
        System.out.println("RightTriangle, "
                + "Area: " + getArea()
                + " side: " + this.side
                + " color: " + super.color);
    }
}
