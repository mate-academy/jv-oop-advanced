package core.basesyntax;

public class IsoscelesTrapezoid implements Figures {
    private double firstbase;
    private double secondbase;
    private double lateral;
    private Colors color;

    public IsoscelesTrapezoid(double firstbase, double secondbase, double lateral, Colors color) {
        this.color = color;
        this.firstbase = firstbase;
        this.secondbase = secondbase;
        this.lateral = lateral;
    }

    @Override
    public double getArea() {
        return (firstbase + secondbase) * Math.sqrt(Math.pow(lateral, 2)
                - Math.pow(firstbase - secondbase, 2) / 4) / 2;
    }

    @Override
    public Colors getColor() {
        return color;
    }

    public double getA() {
        return firstbase;
    }

    public double getB() {
        return secondbase;
    }

    public double getC() {
        return lateral;
    }
}
