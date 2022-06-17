package core.basesyntax;

public class RightTriangle extends Figure implements Draw, ObtainArea {
    private String color;
    private int side;

    public RightTriangle(String color, int side) {
        this.color = color;
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: Right Triangle, area: " + getArea()
                + " sq.units, side: " + side + " units, color: " + color);

    }

    @Override
    public double getArea() {
        return side * side * (Math.sqrt(3) / 4);
    }
}
