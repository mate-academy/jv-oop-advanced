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

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getFigureData() {
        return "Figure: square, area: " + getArea()
                + " sq. units, side: " + getSide()
                + " units, color: " + getColor();
    }
}
