package core.basesyntax;

public class RightTriangle extends Figure implements Drawable, AreaCalculator{
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

    public void setKat1(double kat1) {

        this.kat1 = kat1;
    }

    public void setKat2(double kat2) {

        this.kat2 = kat2;
    }

    @Override
    public double getArea() {
        return (0.5 * getKat1() * getKat2());
    }

    @Override
    public void draw() {
        System.out.println("RightTriangle, area: " + getArea() + " sq. units, kat1: " + getKat1() + " units, kat2: " + getKat2() + " units, color: " + getColor());

    }
}
