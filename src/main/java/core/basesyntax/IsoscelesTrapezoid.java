package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    int sideA;
    int sideB;
    int height;
    @Override
    public void toDraw() {
        System.out.println("Figure: trapezoid, area: "
                + getArea()
                + "sq. units, side 1: "
                + sideA
                + "units, side 2:"
                + sideB
                + "units, height: "
                + height
                + "color: "
                + color);
    }

    @Override
    public double getArea() {
        return (double) (sideA * sideB) /2 * height;
    }
}
