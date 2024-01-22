package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    public static final int DIVIDER_TRAPEZOID = 2;
    private double shorterSide;
    private double longerSide;
    private double height;

    public IsoscelesTrapezoid(String color, double shorterSide, double longerSide, double height) {
        super(color);
        this.shorterSide = shorterSide;
        this.longerSide = longerSide;
        this.height = height;
    }

    public double getShorterSide() {
        return shorterSide;
    }

    public double getLongerSide() {
        return longerSide;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return ((getShorterSide() + getLongerSide()) / DIVIDER_TRAPEZOID) * getHeight();
    }

    @Override
    public void drawable() {
        System.out.println("Figure: Isosceles trapezoid, shorter side " + getShorterSide()
                + " units, longer side " + getLongerSide() + " units + area: "
                + calculateArea() + " sq. units, color " + getColor());
    }
}
