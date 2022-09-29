package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottom;
    private int up;
    private int hight;

    public IsoscelesTrapezoid(String color, int bottom, int up, int hight) {
        super(color);
        this.bottom = bottom;
        this.up = up;
        this.hight = hight;
    }

    @Override
    public double areaCalculation() {
        return ((this.bottom + this.up) / 2) * this.hight;
    }

    @Override
    public void display() {
        System.out.println("Figure: " + name() + ", area: " + areaCalculation()
                + " sq.units, bottom: " + this.bottom + " units, up: " + this.up + " units, hight: "
                + this.hight + " units, color: " + getColor());
    }

    @Override
    public String name() {
        return Figures.ISOSCELES_TRAPEZOID.name();
    }
}
