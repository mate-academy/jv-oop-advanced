package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public int countArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public String draw() {
        return "Figure: Circle\n\tcolor - " + this.color + ";"
                + "\n\t area - " + this.countArea() + " sq. units;"
                + "\n\t radius - " + this.radius + " units.";
    }
}
