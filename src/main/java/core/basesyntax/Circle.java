package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int countArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public String draw() {
        return "Figure: Circle\n\tcolor - " + getColor() + ";"
                + "\n\t area - " + countArea() + " sq. units;"
                + "\n\t radius - " + radius + " units.";
    }
}
