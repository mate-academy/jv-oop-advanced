package core.basesyntax;

public class Rectangle extends Figure {

    private int sideA;
    private int sideB;

    public Rectangle(Color color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    {
        setFigureType("rectangle");
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + getFigureType() + ", area: "
                + area() + " sq.units, sideA: "
                + sideA + " units, sideB: "
                + sideB + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
