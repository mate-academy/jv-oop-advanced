package core.basesyntax;

public class RightTriangle extends Figure {
    private double kat1;
    private double kat2;

    public RightTriangle(double kat1, double kat2, Color color) {
        super(color);
        this.kat1 = kat1;
        this.kat2 = kat2;
    }

    public double getKat1() {

        return kat1;
    }

    public double getKat2() {

        return kat2;
    }

    @Override
    public double getArea() {
        return 0.5 * getKat1() * getKat2();
    }

    @Override
    public void draw() {
        System.out.println(String.format("RightTriangle with area: %.2f sq. units, "
                + "ka1: %.2f units, "
                + "kat2: %.2f units, color: %s", getArea(), getKat1(), getKat2(), getColor()));
    }
}

