package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstKat;
    private double kat2;

    public RightTriangle(double firstKat, double kat2, Color color) {
        super(color);
        this.firstKat = firstKat;
        this.kat2 = kat2;
    }

    public double getFirstKat() {

        return firstKat;
    }

    public double getKat2() {

        return kat2;
    }

    @Override
    public double getArea() {
        return 0.5 * getFirstKat() * getKat2();
    }

    @Override
    public void draw() {
        System.out.println(String.format("RightTriangle with area: %.2f sq. units, "
                + "firstKat: %.2f units, "
                + "kat2: %.2f units, color: %s", getArea(), getFirstKat(), getKat2(), getColor()));
    }
}

