package core.basesyntax;

public class RightTriangle extends Figure {
    private double legHeight;
    private double legBase;

    public RightTriangle(String color, double legHeight, double legBase) {
        super(color);
        this.legHeight = legHeight;
        this.legBase = legBase;
    }

    public double getLegHeight() {
        return legHeight;
    }

    public void setLegHeight(double legHeight) {
        this.legHeight = legHeight;
    }

    public double getLegBase() {
        return legBase;
    }

    public void setLegBase(double legBase) {
        this.legBase = legBase;
    }

    @Override
    public double areaCalculator() {
        return legBase * legBase * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + this.getClass().getName()
                + ", area: "
                + areaCalculator()
                + " sq.units, legHeight: "
                + getLegHeight()
                + " units, legBase: "
                + getLegBase()
                + " units, color: " + getColor());
    }
}
