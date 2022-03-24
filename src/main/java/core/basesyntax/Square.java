package core.basesyntax;

public class Square extends Figure {
    private int side;
    private double area;

    public Square(String color, int side) {
        super(color);
        this.side = side;
        this.area = side * 2;
    }

    @Override
    public String toString() {
        return "Figure: square"
                + ", area: " + area + " sq.units"
                + ", side: " + side + " units"
                + ", color: " + super.getColor().toLowerCase();
    }

    @Override
    public void paint() {
        System.out.println(this);
    }
}
