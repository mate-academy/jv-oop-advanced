package core.basesyntax;

public class Circle extends Figure {
    int radius;
    public Circle(int radius, String color) {
        super.color = color;
        this.radius = radius;
        super.name = "Circle";
        super.area = Math.PI * radius * radius;
    }
    @Override
    public String getFigure() {
        return "Figure: " + super.name + ", area: " + super.area + " sq. units, radius: " + radius + " units, color: " + super.color;
    }
}
