package core.basesyntax;

public class RightTriangle extends Figure implements Figures {
    private int side;
    private int height;

    public RightTriangle() {
        this.side = Main.rnd(1, 15);
        this.height = Main.rnd(1, 14);
        name = "right triangle";
        area = area();
        color = new ColorSupplier().getRandomColor();
    }

    public double area() {
        return ((double) side * height) / 2;
    }

    public String toString() {
        return "Figure: " + name
                + ", area: " + area
                + " sq.units, side: " + side
                + " units, height: " + height
                + " units, color: " + color;
    }
}
