package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure{
    private double baseUp;
    private double baseBottom;
    private double height;

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
