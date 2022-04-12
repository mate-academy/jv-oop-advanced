package core.basesyntax;

public class Square extends Figure implements CanObtainArea, CanDraw {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + getArea() + " sq.units, side: "
                + getSide() + " units, color: " + getColor();
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
