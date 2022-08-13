package core.basesyntax;

public class RightTriangle implements Figure {
    private int side;
    private String color;

    public RightTriangle(int side, String color) {
        this.side = side;
        this.color = color;
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
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Figure: rightTriangle, area: "
                + Math.sqrt(3) * side * side / 4
                + " sq.units, side: "
                + side
                + " units, color: " + color;
    }
}
