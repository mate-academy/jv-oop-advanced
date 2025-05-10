package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseUP;
    private double baseBottom;
    private double height;

    public IsoscelesTrapezoid(String color, double baseUP, double baseBottom, double height) {
        super(color);
        this.baseUP = baseUP;
        this.baseBottom = baseBottom;
        this.height = height;
    }

    public double getBaseUP() {
        return baseUP;
    }

    public double getBaseBottom() {
        return baseBottom;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return height * (baseUP + baseBottom) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid" + ". Area " + getArea()
                + ". Color = " + getColor() + ". BaseUP = "
                + getBaseUP() + ". BaseBottom = "
                + getBaseBottom() + ". Height = " + getHeight());
    }
}
