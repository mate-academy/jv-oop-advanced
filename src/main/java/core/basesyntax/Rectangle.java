package core.basesyntax;

public class Rectangle extends Figure {
    private int base;
    private int side;

    public Rectangle(int base, int side) {
        this.base = base;
        this.side = side;
    }

    public Rectangle(int base, int side, String color) {
        this.base = base;
        this.side = side;
        super.color = color;
    }

    @Override
    public double getFigureArea() {
        return base * side;
    }

    @Override
    public String getFigureInfo() {
        return "Figure: Rectangle, area: " + getFigureArea() + " sq. units, base: " + base
                + " side " + side + " units, color: " + super.color;
    }
    /* Wzór na pole Prostokąta a*b */
}
