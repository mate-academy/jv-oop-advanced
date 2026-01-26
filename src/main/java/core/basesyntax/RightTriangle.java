package core.basesyntax;

public class RightTriangle extends Figure {
    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color, firstLeg, secondLeg);
        this.name = "triangle";
        this.parameters = new String[]{"firstLeg", "secondLeg"};
    }

    @Override
    public double getArea() {
        int firstLeg = values[0];
        int secondLeg = values[1];
        return 0.5 * firstLeg * secondLeg;
    }
}
