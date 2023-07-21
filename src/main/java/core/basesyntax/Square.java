package core.basesyntax;

public class Square extends Figure {
    private double sideLength;

    public Square(double sideLength, Color color) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: square, ")
                .append("area: ").append(getArea()).append(" sq.units, ")
                .append("side: ").append(sideLength).append(" units, ")
                .append("color: ").append(getColor().name().toLowerCase());

        System.out.println(stringBuilder);
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}
