package core.basesyntax;

public class Square extends Figure implements AreaCalculator {
    private int side;
    
    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, "
                + "area: "
                + getArea()
                + " sq. units, "
                + "side: "
                + side
                + " units, "
                + "color: "
                + getColor();
    }
}
