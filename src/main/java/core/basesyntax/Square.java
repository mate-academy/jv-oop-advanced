package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + String.format("%.1f",getArea())
                + " sq.units, side: " + side
                + " units, color: " + getColor());
    }

    @Override
    public Double getArea() {
        Double result = Math.pow(side, 2);
        return result;
    }
}
