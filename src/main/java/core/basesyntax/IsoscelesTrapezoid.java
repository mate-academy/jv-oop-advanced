package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Parametrs{
    private double firsBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(String name, String color, double firsBase, double secondBase, double height) {
        super(name, color);
        this.firsBase = firsBase;
        this.secondBase = secondBase;
        this.height = height;
        calculateArea();
    }

    public double getArea() {
        return (firsBase + secondBase) / 2 * height;
    }

    @Override
    public boolean isFlat() {
        return true;
    }

    @Override
    public boolean isSimple() {
        return false;
    }
}
