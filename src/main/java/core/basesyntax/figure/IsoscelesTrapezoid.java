package core.basesyntax;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class IsoscelesTrapezoid extends Figure {

    private final double upperBase;
    private final double lowerBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double upperBase, double lowerBase, double height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double GetArea() {
        return ((upperBase + lowerBase) / 2) * height;
    }

    @Override
    public void GetPrint() {
        System.out.println("Figura: Trójkąt " + "Pole: " + (((upperBase + lowerBase) / 2) * height) + " Kolor: " + getColor());
    }
}
