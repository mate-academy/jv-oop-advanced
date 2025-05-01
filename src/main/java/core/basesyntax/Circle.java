package core.basesyntax;

public class Circle extends Figure {
    int radius;
    public Circle(int radius, String color) {
        super(color, Math.PI * radius * radius,"Circle");
        this.radius = radius;
    }
    @Override
    public String getFigure() {
        return "Figure: " + super.name + ", area: " + super.area + " sq. units, radius: " + radius + " units, color: " + super.color;
    }
}
