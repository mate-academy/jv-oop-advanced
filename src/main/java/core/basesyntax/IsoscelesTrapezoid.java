package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(int firstSide, int secondSide, int height, Color color) {
        super("IsoscelesTrapezoid", color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double calculatorArea() {
        return 0.5 * (firstSide + secondSide) * height;
    }

    @Override
    public void draw() {
        System.out.println("Name: " + this.name + ", Color: " + this.color.name()
                + ", First side: " + this.firstSide + ", Second Side: " + secondSide
                + ", Height: " + this.height + ", Area: " + this.calculatorArea() + ".");
    }
}
