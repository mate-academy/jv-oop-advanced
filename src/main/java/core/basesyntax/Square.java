package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square() {
        super();
    }

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: square, area: ");
        builder.append(getArea());
        builder.append(" sq.units, side: ");
        builder.append(side);
        builder.append(" units, color: ");
        builder.append(getColor().toLowerCase());
        System.out.println(builder);
    }
}
