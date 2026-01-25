package core.basesyntax;

public class RightTriangle extends Figure {
    public RightTriangle(Color color, int value1, int value2) {
        super(color, value1, value2);
        this.name = "triangle";
        this.parameters = new String[]{"firstLeg", "secondLeg"};
    }

    @Override
    protected double getArea() {
        int firstLeg = values[0];
        int secondLeg = values[1];
        return 0.5 * firstLeg * secondLeg;
    }
}
