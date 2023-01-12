package core.basesyntax;

public class RigtTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RigtTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = random.nextInt(Max_Value);
        this.secondLeg = random.nextInt(Max_Value);
    }

    @Override
    public String toString() {
        return "RigtTriangle{" +
                "firstLeg=" + firstLeg +
                ", secondLeg=" + secondLeg +
                ", color=" + color +
                ", area=" + getArea() +
                '}';
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
