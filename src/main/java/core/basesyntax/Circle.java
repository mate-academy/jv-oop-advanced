package core.basesyntax;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    @Override
    public void calculateArea() {
        this.area = radius * radius * Math.PI;
    }

    @Override
    public void draw() {

    }
}
