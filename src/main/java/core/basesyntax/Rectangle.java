package core.basesyntax;

public class Rectangle extends Figure implements Figures {
    private int side1;
    private int side2;

    public Rectangle() {
        this.side1 = Main.rnd(1, 15);
        this.side2 = Main.rnd(1, 15);
        this.area = area();
        this.name = "rectangle";
        this.color = new ColorSupplier().getRandomColor();
    }

    public double area() {
        return (double) this.side1 * this.side2;
    }

    public String toString() {
        return "Figure: " + name
                + ", area: " + area
                + " sq.units, side1: " + side1
                + " units, side2: " + side2
                + " units, color: " + color;
    }
}
