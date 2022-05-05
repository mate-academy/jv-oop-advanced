package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstbase;
    private double secondbase;
    private double lateral;
    public IsoscelesTrapezoid(double firstbase, double secondbase, double lateral, Colors color) {//a,b - trapezoid base; c - lateral trapezoid;
        super(color);
        this.firstbase = firstbase;
        this.secondbase = secondbase;
        this.lateral = lateral;
    }

    public double getArea() {
        return (firstbase + secondbase) * Math.sqrt(Math.pow(lateral, 2) - Math.pow(firstbase - secondbase, 2) / 4) / 2;
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
