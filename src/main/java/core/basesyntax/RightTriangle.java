package core.basesyntax;

public class RightTriangle {
    private double kat1;
    private double kat2;

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

    public int getArea() {
        return (int) (0.5 * getKat1() * getKat2());
    }
}
