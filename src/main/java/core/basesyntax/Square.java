package core.basesyntax;

public class Square extends Figure implements Figures {
    private int side;

    public Square() {
        this.side = Main.rnd(1, 15);
        this.area = area();
        this.name = "square";
        this.color = new ColorSupplier().getRandomColor();
    }

    public double area() {
        return (double) this.side * this.side;
    }

    public String toString() {
        return "Figure: " + name
                + ", area: " + area
                + " sq.units, side: " + side
                + " units, color: " + color;
    }
}
