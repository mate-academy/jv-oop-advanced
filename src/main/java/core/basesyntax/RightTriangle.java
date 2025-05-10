package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstSide;
    private int secondSide;

    public RightTriangle(int firstSide, int secondSide, Color color) {
        super("Right Triangle", color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculatorArea() {
        return 0.5 * firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Name: " + this.name + ", Color: " + this.color.name() + ", firstSide: "
                + this.firstSide + ", secondSide: " + this.secondSide
                + ", Area: " + this.calculatorArea() + ".");
    }
}
