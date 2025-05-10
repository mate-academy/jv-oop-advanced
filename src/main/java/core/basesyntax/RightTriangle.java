package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(int side, String color) {
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
        System.out.println(" Figure: rightTriangle, area: " + area()
                + " sq.units, three same sides: " + getSide()
                + " units, color: " + getColor());

    }

    @Override
    public double area() {
        return (Math.sqrt(3) * (side * side)) / 4;
    }
}
