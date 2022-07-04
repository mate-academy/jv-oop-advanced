package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double baseSide;
    private double height;

    public RightTriangle(String color, double baseSide, double height) {
        super(color);
        this.baseSide = baseSide;
        this.height = height;
    }

    public double getBaseSide() {
        return baseSide;
    }

    public void setBaseSide(double baseSide) {
        this.baseSide = baseSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * baseSide * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure:"
                + getClass().getSimpleName()
                + ", area: "
                + getArea()
                + " sq.units, baseSide: "
                + baseSide
                + " units,"
                + " height"
                + height
                + " units, "
                + " color: "
                + getColor());
    }

    @Override
    public String toString() {
        return "RightTriangle{"
                + "baseSide="
                + baseSide
                + ", height="
                + height
                + '}';
    }
}