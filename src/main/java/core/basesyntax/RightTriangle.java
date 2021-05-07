package core.basesyntax;

import static core.basesyntax.Main.rnd;

public class RightTriangle extends Figure implements Figures {
    int side;
    int height;

    public RightTriangle() {
        this.side = rnd(1, 15);
        this.height = rnd(1, 14);
        name = "right triangle";
        area = area();
        color = new ColorSupplier().getRandomColor();
    }

    public double area() {
        return ((double) side * height) / 2;
    }

    public String toString() {
        return "Figure: " + name +
                ", area: " + area +
                " sq.units, side: " + side +
                " units, height: " + height +
                " units, color: " + color;
    }
}
