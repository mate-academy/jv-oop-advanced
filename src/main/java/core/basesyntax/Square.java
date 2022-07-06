package core.basesyntax;

public class Square extends Figure implements FigureInfo {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + " area: " + area() + " sq.units, side: "
                + side + " units, color: " + getColor());
    }
}
