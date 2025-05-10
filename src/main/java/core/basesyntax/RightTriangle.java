package core.basesyntax;

public class RightTriangle extends Figure {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private double legBase;
    private double legHeight;

    public RightTriangle(double legBase, double legHeight, String color) {
        super(color);
        this.legBase = legBase;
        this.legHeight = legHeight;
    }

    public double getLegBase() {
        return legBase;
    }

    public void setLegBase(double legBase) {
        this.legBase = legBase;
    }

    public double getLegHeight() {
        return legHeight;
    }

    public void setLegHeight(double legHeight) {
        this.legHeight = legHeight;
    }

    @Override
    public double getArea() {
        return legBase * legHeight / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq.units, legBase: " + getLegBase() + " units, legHeight: "
                + getLegHeight() + " units, color: " + colorSupplier.getRandomColor());
    }
}
