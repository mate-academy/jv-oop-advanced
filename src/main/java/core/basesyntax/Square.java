package core.basesyntax;

public class Square extends Figure implements Drawable {
    private Double side;

    public Square(Double side, String color) {
        super(color, FigureType.SQUARE);
        this.side = side;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public Double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + side
                + " units, color: " + getColor() + "\n");
    }
}
