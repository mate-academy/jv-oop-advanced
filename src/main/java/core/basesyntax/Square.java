package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public float getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        System.out.println(
                sb.append("Figure: square, area: ")
                        .append(getArea())
                        .append(" sq.units, side: ")
                        .append(side)
                        .append(" units, color: ")
                        .append(getColor()));
    }
}
