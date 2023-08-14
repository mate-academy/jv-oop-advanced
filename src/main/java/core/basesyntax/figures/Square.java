package core.basesyntax.figures;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
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
        stringBuilder.append("Figure: square, area: ").append(getArea())
                .append(", side: ").append(side)
                .append(", color:").append(getColor())
                .append('\n');
        System.out.println(stringBuilder.toString());
    }
}
