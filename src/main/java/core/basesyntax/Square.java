package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(getClass().getSimpleName())
                .append(", area: ").append(getArea()).append(" sq.units, side: ")
                .append(side).append(" units, color: ").append(getColor()).toString();
        System.out.println(sb);
    }
}
