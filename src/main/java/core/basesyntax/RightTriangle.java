package core.basesyntax;

public class RightTriangle extends Figure {
    private int side1;
    private int side2;

    public RightTriangle(String color, int side1, int side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getArea() {
        return 0.5 * side1 * side2;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("\nFigure: RightTriangle, "
                + "area: "
                + getArea()
                + " units, side: "
                + side1
                + " units, side: "
                + side2
                + " units, color:"
                + color);
    }
}
