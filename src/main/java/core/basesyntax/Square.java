package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: square, area: ");
        stringBuilder.append(getArea());
        stringBuilder.append(" sq.units, side: ");
        stringBuilder.append(side);
        stringBuilder.append(" units, color: ");
        stringBuilder.append(getColor());
        System.out.println(stringBuilder.toString());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
