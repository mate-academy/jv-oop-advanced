package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    public IsoscelesTrapezoid(Color color, int base1, int base2, int height) {
        super(color, base1, base2, height);
        this.name = "trapezoid";
        this.parameters = new String[]{"base1", "base2", "height"};
    }

    @Override
    public double getArea() {
        int base1 = values[0];
        int base2 = values[1];
        int height = values [2];
        return 0.5 * (base1 + base2) * height;
    }
}
