package core.basesyntax;

public class Square extends AbstractFigure {
    private int side;
    private String color;

    public Square(int side, String color) {
        setSide(side);
        this.color = color;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public String getSize() {
        return "side: " + getSide() + " units,";
    }

    @Override
    public double area() {
        return side * side;
    }
}
