package core.basesyntax;

public class Square extends Figure {
    private String color;
    private int side;

    public Square() {

    }

    public Square(String color, int side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: square, area: ").append(calculateArea());
        builder.append(" sq.units, side: ").append(side);
        builder.append(" units, color: ").append(color);
        System.out.println(builder);
    }

    @Override
    public double calculateArea() {
        return (double) side * side;
    }
}
