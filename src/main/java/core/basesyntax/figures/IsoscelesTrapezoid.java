package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private final double baseUp;
    private final double baseBottom;
    private final double height;

    public IsoscelesTrapezoid(String color, double baseUp, double baseBottom, double height) {
        super(color);
        this.baseUp = baseUp;
        this.baseBottom = baseBottom;
        this.height = height;
        calcArea();
    }

    public void calcArea() {
        area = 0.5 * (baseUp + baseBottom) * height;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Base (top): " + roundDouble(baseUp) + " units");
        System.out.println("Base (bottom): " + roundDouble(baseBottom) + " units");
        System.out.println("Height: " + roundDouble(height) + " units");
    }

}
