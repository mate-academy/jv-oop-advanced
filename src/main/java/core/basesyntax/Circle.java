package core.basesyntax;

public class Circle extends Figure implements Area {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double areaCalculator() {
        return Math.PI * radius * radius;
    }
}
