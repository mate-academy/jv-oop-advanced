package core.basesyntax;

import static core.basesyntax.Main.rnd;

public class IsoscelesTrapezoid extends Figure implements Figures {
    int side1;
    int side2;
    int height;

    public IsoscelesTrapezoid() {
        this.side1 = rnd(1, 15);
        this.side2 = rnd(1, 15);
        this.height = rnd(1, 15);
        this.area = area();
        this.name = "isosceles trapezoid";
        this.color = new ColorSupplier().getRandomColor();
    }

    public double area() {
        return ((double) this.side1 + this.side2) / 2 * this.height;
    }

    public String toString() {
        return "Figure: " + name +
                ", area: " + area +
                " sq.units, side1: " + side1 +
                " sq.units, side2: " + side2 +
                " units, height: " + height +
                " units, color: " + color;
    }
}
