package core.basesyntax;

public class Rectangle extends Figure {
    int sideA;
    int sideB;
    @Override
    public void toDraw() {
        System.out.println("Figure: rectangle, area: "
                + getArea()
                + "sq. units, side 1 : "
                + sideA
                + "units ,side 2 : "
                + sideB
                + "units, color: "
                + color);
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
