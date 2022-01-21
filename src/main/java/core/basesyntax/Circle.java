package core.basesyntax;

public class Circle extends Figure {
    private String name = "Circle";
    private String color;
    private int radius;

    Circle() {
    }

    Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double countArea() {
        return radius * radius * 3.14;
    }

    public void getInfo() {
        System.out.println("Figure: " + this.name + ", area: " + this.countArea()
                + " sq.un., radius: " + this.radius + " units, color: " + this.color + ".");
    }
}
