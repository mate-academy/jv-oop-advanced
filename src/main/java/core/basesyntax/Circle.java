package core.basesyntax;

public class Circle extends Figure implements Parametrs{
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI + Math.pow(radius, 2);
    }

    @Override
    public boolean isFlat() {
        return true;
    }

    @Override
    public boolean isSimple() {
        return true;
    }


}
