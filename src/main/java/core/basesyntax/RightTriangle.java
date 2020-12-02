package core.basesyntax;

public class RightTriangle extends Figure {
    private final int base;
    private final int height;

    public RightTriangle(Colors color, int base, int height) {
        super(0.5 * base * height, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, hypotenuse: "
                + getHypotenuse() + " units, color: " + getColor());
    }

    public double getHypotenuse() {
        return Math.sqrt(base * base + height * height);
    }
}

