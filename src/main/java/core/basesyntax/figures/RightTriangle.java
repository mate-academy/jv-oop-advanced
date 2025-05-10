package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double firstSide;
    private double secondSide;
    private double hypotenuse;

    public RightTriangle(String color, double firstSide, double secondSide) {
        super(color);
        this.hypotenuse = Math.sqrt((firstSide * firstSide) + (secondSide * secondSide));
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return 0.5 * firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: %s right triangle,"
                        + " first side: %.2f, second side: %.2f, hypotenuse: %.2f, area: %.2f",
                this.color, this.firstSide, this.secondSide, this.hypotenuse, this.getArea()));
    }
}
