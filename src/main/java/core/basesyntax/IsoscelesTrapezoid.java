package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int side1;
    private int side2;
    private int height;

    public IsoscelesTrapezoid(String color, int side1, int side2, int height) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * (side1 * side2) * height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("\nFigure: Isosceles Trapezoid"
                + " area: "
                + getArea()
                + " units, firstLeg: "
                + side1
                + " units, secondLeg: "
                + side2
                + " units thirdLeg: "
                + height
                + " color: "
                + color);
    }
}
