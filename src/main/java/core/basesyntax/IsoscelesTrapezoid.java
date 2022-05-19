package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, Drawable {
    private final double firstSide;
    private final double secondSide;
    private final double height;

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide, double height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (height / 2) * (firstSide * secondSide);
    }

    @Override
    public void draw() {
        System.out.println("color = " + getColor() + " firstSide = " + firstSide + " secondSide = " + secondSide + " height = " + height);
    }
}
