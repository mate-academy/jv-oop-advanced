package core.basesyntax;

public class RightTriangle extends Figure {
    private int legBase;
    private int legHeight;

    public RightTriangle(String color, int legBase, int legHeight) {
        super(color);
        this.legBase = legBase;
        this.legHeight = legHeight;
    }

    public int getLegBase() {
        return legBase;
    }

    public void setLegBase(int legBase) {
        this.legBase = legBase;
    }

    public int getLegHeight() {
        return legHeight;
    }

    public void setLegHeight(int legHeight) {
        this.legHeight = legHeight;
    }

    @Override
    public double getArea() {
        return (double) 1 / 2 * legBase * legHeight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, legBase: " + getLegBase()
                + " units, legHeight: " + getLegHeight()
                + " units, color: " + getColor());
    }
}
