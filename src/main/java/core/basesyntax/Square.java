package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        this.setColor(color);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: isoscelesTrapezoid, area: " + area()
                + " sq.units, side: " + getSide()
                + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return side * side;
    }
}
