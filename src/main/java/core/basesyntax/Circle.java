package core.basesyntax;

public class Circle extends Figure implements Behavior{
    private  int radius;

    public int getRadius() {
        return radius;
    }

    public  Circle(int radius, String color, String name) {
        this.radius = radius;
        super.setColor(color);
        super.setName(name);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
