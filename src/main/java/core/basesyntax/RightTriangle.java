package core.basesyntax;

public class RightTriangle extends Figure {
    private final double sideA;
    private final double sideB;

    public RightTriangle(double sideA, double sideB, String color, String typeOfFigure) {
        super(color, typeOfFigure);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double hypotenuse() {
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }

    @Override
    public double getArea() {
        return (sideA * sideB) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getTypeOfFigure()
                + ", area: " + getArea() + " sq. units, hypotenuse: "
                + hypotenuse() + " units, color: " + getColor());
    }
}
