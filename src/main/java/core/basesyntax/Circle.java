package core.basesyntax;

public class Circle extends Figure implements Area{
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public Circle(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        return 0;
    }


}
