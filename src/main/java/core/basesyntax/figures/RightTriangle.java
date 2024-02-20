package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.ceil(((side * side) * Math.sqrt(3)) / 4);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, " + "area: "
                + getArea() + " sq. units, " + "side: "
                + side + " units, " + "color: "
                + getColor());
    }
}
