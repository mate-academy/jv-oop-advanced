package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    int base1;
    int base2;
    int height;
    @Override
    public String draw() {
        return "isoscelesTrapezoid, " +
                "area: " + getArea() + "sq. units, " +
                "upperBase: " + base1 + "units, " +
                "lowerBase: " + base2 + "units, " +
                "height: " + height  + "units, " +
                "color: " + color;
    }
    @Override
    public int getArea() {
        return (base1 + base2) * height / 2;
    }
}
