package core.basesyntax;

import static core.basesyntax.Main.rnd;

public class Rectangle extends Figure implements Figures {
    int side1;
    int side2;

    public Rectangle() {
        this.side1 = rnd(1, 15);
        this.side2 = rnd(1, 15);
        this.area = area();
        this.name = "rectangle";
        this.color = new ColorSupplier().getRandomColor();
    }

    public double area() {
        return (double) this.side1 * this.side2;
    }

    public String toString() {
        return "Figure: " + name +
                ", area: " + area +
                " sq.units, side1: " + side1 +
                " units, side2: " + side2 +
                " units, color: " + color;
    }
}
