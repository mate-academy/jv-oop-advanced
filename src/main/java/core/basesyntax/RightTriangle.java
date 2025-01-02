package core.basesyntax;

public class RightTriangle extends Figure implements FigureMethods {
    private final float firstLeg;
    private final float secondLeg;

    public RightTriangle(Colors color, float firstLeg, float secondLeg) {
        super(color, "RightTriangle");
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double area() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + area() + " sq. units, firstLeg: "
                + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: " + getColor());
    }
}
