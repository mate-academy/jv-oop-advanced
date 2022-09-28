package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;
    private int base;
    private int height;

    public RightTriangle() {
        this.height = random.nextInt(VALUE_LIMIT);
        this.base = random.nextInt(VALUE_LIMIT);
        this.side = random.nextInt(VALUE_LIMIT);
        this.color = colorSupplier.getRandomColor();
        area();
    }

    public RightTriangle(int side, int base, int height, String color) {
        this.height = height;
        this.base = base;
        this.side = side;
        this.color = color;
        area();
    }

    @Override
    public void draw() {
        System.out.printf("Figure: triangle, area: %.1f sq.units, side: %d units,"
                + " base: %d, height: %d color: %s%n", area, side, base, height, color);
    }

    @Override
    public void area() {
        this.area = (base * height) / (double) 2;
    }
}
