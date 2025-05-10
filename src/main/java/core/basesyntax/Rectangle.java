package core.basesyntax;

public class Rectangle extends Figure {

    private double sideA;
    private double sideB;

    public Rectangle(Color color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        setType(FigureType.RECTANGLE);
    }

    @Override
    public double getArea() {
        return sideA * sideB;
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
