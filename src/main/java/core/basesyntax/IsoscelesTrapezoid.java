package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private static final int MAX_BASE_SIDE = 20;
    private static final int MAX_TOP_SIDE = 20;
    private static final int MAX_HEIGHT = 20;
    private int baseSide;
    private int topSide;
    private int height;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(int baseSide, int topSide, int height, String color) {
        super(color);
        this.baseSide = baseSide;
        this.topSide = topSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * baseSide * topSide * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + ", baseSide: " + baseSide + ", topSide: " + topSide
                + ",height: " + height + ", color: " + getColor() + ".");
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        return new IsoscelesTrapezoid(random.nextInt(MAX_BASE_SIDE), random.nextInt(MAX_TOP_SIDE),
                random.nextInt(MAX_HEIGHT),
                colorSupplier.getRandomColor());
    }
}
