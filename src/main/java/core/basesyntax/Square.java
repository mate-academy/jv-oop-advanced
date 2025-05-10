package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, color: " + getColor()
                + ", side: " + side + ", area: " + areaCalculate());
    }

    @Override
    public double areaCalculate() {
        return (side * side);
    }
}
