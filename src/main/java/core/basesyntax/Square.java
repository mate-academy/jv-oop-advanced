package core.basesyntax;

public class Square extends Figure {
    private String color;
    private int side;

    public Square(String color, int side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
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
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String draw() {
        return "Figure: Square, color: " + getColor() + ", "
                + "area: " + getArea() + " sq.units, "
                + "side: " + side;
    }
}
