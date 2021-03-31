package core.basesyntax;

public class Rectangle extends Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB, String color, String typeOfFigure) {
        super(color, typeOfFigure);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double getArea() {
        return (sideA * sideB) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getTypeOfFigure()
                + ", area: " + getArea() + " sq. units, side length: "
                + getSideA() + " units, width: " + getSideB()
                + " units, color: " + getColor());
    }
}
