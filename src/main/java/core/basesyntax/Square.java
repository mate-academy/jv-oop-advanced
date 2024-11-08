package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: square, ")
                .append("area: ").append(getArea()).append(" sq.units, ")
                .append("side: ").append(side).append(" units, ")
                .append("color: ").append(color);
        System.out.println(stringBuilder.toString());
    }
}
