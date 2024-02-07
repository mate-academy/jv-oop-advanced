package core.basesyntax;

public class RightTriangle extends Figure {
    private int height;
    private int basis;

    public RightTriangle(String color, int height, int basis) {
        super(color);
        this.height = height;
        this.basis = basis;
    }

    public int getHeight() {
        return height;
    }

    public int getBasis() {
        return basis;
    }

    @Override
    public double getArea() {
        return height * basis / 2;
    }

    @Override
    public String draw() {
        return "Figure: right triangle,"
                + " area: " + getArea()
                + " sq. units, height: " + height
                + " units, basis: " + basis
                + " units, color: " + getColor();
    }
}
