package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstbase;
    private double secondbase;
    private double lateral;

    public IsoscelesTrapezoid(double firstbase, double secondbase, double lateral, Color color) {
        super(color);
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
    public String draw() {
        return "Figure: trapesoid, area: " + String.format("%(.1f", getArea())
                + " sq.units, a: " + firstbase
                + " units, b: " + secondbase
                + " units, c: " + lateral
                + " units, color: " + getColor();
    }
}
