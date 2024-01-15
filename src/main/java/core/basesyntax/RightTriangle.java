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

    public double getLegBase() {
        return legBase;
    }

    public void setLegHeight(double legHeight) {
        this.legHeight = legHeight;
    }

    public void setLegBase(double legBase) {
        this.legBase = legBase;
    }

    @Override
    public double getArea() {
        return legHeight * legBase * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, legBase: "
                + legBase + " units, legHeight: "
                + legHeight + " units, color: " + getColor());
    }
}
