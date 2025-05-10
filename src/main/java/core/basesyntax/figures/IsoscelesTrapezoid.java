package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide, double height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ": area: "
                + calculateArea() + " firstSide " + getFirstSide()
                + " secondSide " + getSecondSide() + " hight " + getHeight()
                + ", color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return (height * (firstSide + secondSide)) / 2;
    }
}
