package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public Circle(int radius, String color) {
        this.radius = radius;
        super.color = color;
    }
    @Override
    public double getFigureArea() {
        return Math.round(Math.PI * radius * radius);
    }

    @Override
    public String getFigureInfo() {
        return "Figure: Circle, area: " + getFigureArea() + " sq. units, radius: " + radius + " units, color: " + super.color;
    }
    /* Wzór na pole koła pi*r*r */
}
