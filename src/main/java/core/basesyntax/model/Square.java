package core.basesyntax.model;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder("Figure: square, area: ").append(getArea())
                .append(" sq.units, side: ").append(side)
                .append(" units, color: ").append(getColor().toLowerCase()));
    }
}
