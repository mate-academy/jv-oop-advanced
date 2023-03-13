package core.basesyntax;

public class RightTriangle extends Figure {

    private double sideA;
    private double sideB;

    public RightTriangle(Color color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        setType(FigureType.RIGHTTRIANGLE);
    }

    @Override
    public double getArea() {
        return sideA * sideB / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure:"
                + getType()
                + ", area: " + getArea() + " sq.units,"
                + " sideA / sideB: " + sideA + " / " + sideB + " units,"
                + " color: " + getColor());
    }
}
