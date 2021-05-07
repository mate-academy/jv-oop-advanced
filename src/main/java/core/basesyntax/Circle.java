package core.basesyntax;

import java.util.Random;

public class Circle extends Figure implements Figures{
    int radius;

    public Circle() {
        this.radius = 1 + new Random().nextInt(10);
        this.area = area();
        this.name = "circle";
        this.color = new ColorSupplier().getRandomColor();
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public String toString() {
        return "Figure: " + name +
                ", area: " + area +
                " sq.units, radius: " + radius +
                " units, color: " + color;
    }
}
