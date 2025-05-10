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

    public void setSide(int firstLeg) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (side * 3);
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + "rightTriangle, "
                + "area: " + calculateArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
