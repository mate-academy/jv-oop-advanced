package core.basesyntax;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(int base, int height, Color color) {
        super(color);
        this.setBase();
        this.setHeight();
    }

    public int getBase() {
        return base;
    }

    public void setBase() {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight() {
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * getHeight() / 2;
    }

    @Override
    public String toDraw() {
        return " Figure: RightTriangle, area: " + getArea()
                + " sq.units, base: " + base
                + " units, height: " + getHeight()
                + " units, color: " + getColor();
    }
}
