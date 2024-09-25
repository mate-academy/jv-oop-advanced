package core.basesyntax;

public class Circle extends Figure implements Area {

    private double radius;

    @Override
    public double obtainTheArea() {
        return 2 * Math.PI * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
