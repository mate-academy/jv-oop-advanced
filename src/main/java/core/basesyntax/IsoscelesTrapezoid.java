package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Figures {
    private int side1;
    private int side2;
    private int height;

    public IsoscelesTrapezoid() {
        this.side1 = Main.rnd(1, 15);
        this.side2 = Main.rnd(1, 15);
        this.height = Main.rnd(1, 15);
        this.area = area();
        this.name = "isosceles trapezoid";
        this.color = new ColorSupplier().getRandomColor();
    }

    public double area() {
        return ((double) this.side1 + this.side2) / 2 * this.height;
    }

    public String toString() {
        return "Figure: " + name
                + ", area: " + area
                + " sq.units, side1: " + side1
                + " sq.units, side2: " + side2
                + " units, height: " + height
                + " units, color: " + color;
    }
}
