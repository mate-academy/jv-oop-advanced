package core.basesyntax;

public class Square extends Figure implements Drawable, AreaCalculator {
    private int side;

    public Square(String color, int side) {
        this.setColor(color);
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: square, area: " + this.getArea()
                + " sq.units, side: " + this.getSide() + " units, color: " + this.getColor());
    }
}
