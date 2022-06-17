package core.basesyntax;

public class Square extends Figure implements Draw, ObtainArea {
    private String color;
    private int side;

    public Square(String color, int side) {
        this.color = color;
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: Square, area: " + getArea() + " sq.units, side: " + side
                + " units, color: " + color);

    }

    @Override
    public double getArea() {
        return side * side;
    }
}
