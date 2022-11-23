package core.basesyntax;

public class Square extends Figure {
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
    public void draw() {
        StringBuilder info = new StringBuilder("Figure: square, area: ");
        info.append(getArea());
        info.append(" sq.units, side: ");
        info.append(side);
        info.append(" units, color: ");
        info.append(getColor().toLowerCase());
        System.out.println(info);
    }
}
