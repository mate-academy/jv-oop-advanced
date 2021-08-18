package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String name, String color) {
        super(name, color);
        this.side = (int)(Math.random() * 100);
    }

    @Override
    public double getArea() {
        return (double) side * side;
    }

    @Override
    public String getDrow() {
        return "Figure: " + getName() + ", area: " + getArea() + " sq.units, "
                    + "side: " + side + " units, " + "color: " + getColor();
    }
}
