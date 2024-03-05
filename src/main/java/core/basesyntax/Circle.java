package core.basesyntax;

public class Circle extends Figure{
    private  int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String getArea() {
        return String.valueOf(Math.PI * radius * radius);
    }
    @Override
    public String draw() {
        return "Figure: Circle, area:" + getArea() + "sq. units, radius: " + radius + "units, color:" + super.draw();
    }
}
