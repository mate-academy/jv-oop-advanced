package core.basesyntax;

import static core.basesyntax.Main.rnd;

public class Square extends Figure implements Figures {
    int side;

    public Square() {
        this.side = rnd(1, 15);
        this.area = area();
        this.name = "square";
        this.color = new ColorSupplier().getRandomColor();
    }

    public double area() {
        return (double) this.side * this.side;
    }

    public String toString() {
        return "Figure: " + name +
                ", area: " + area +
                " sq.units, side: " + side +
                " units, color: " + color;
    }
}
