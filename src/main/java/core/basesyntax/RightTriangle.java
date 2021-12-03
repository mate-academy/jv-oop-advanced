package core.basesyntax;

public class RightTriangle extends Figure {
    private double height;
    private double base;
    private Colors color;
    private double area;

    public RightTriangle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        this.height = Math.random();
        this.base = Math.random();
        this.color = colorSupplier.getRandomColor();
        this.area = (base * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Right triangle:");
        System.out.println(" height: " + height
                + "base: " + base
                + "color:" + color
                + " area: " + area);
    }
}
