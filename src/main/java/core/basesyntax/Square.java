package core.basesyntax;

public class Square extends Figure {
    private int side;
    private String name = "square";

    public Square (String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: " + this.name + ", area: " + this.getArea() + " sq.units, side: " + this.side + " units, color: " + this.color;
    }
}
