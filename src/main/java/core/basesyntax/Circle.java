package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int i) {
        super();
    }

    @Override
    public Unit[] getUnits() {
        return new Unit[]{new Unit("radius", radius)};
    }
}
