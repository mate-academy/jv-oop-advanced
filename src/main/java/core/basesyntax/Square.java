package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: square, area: ")
                .append(getArea())
                .append(" sq. units, side: ")
                .append(side)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(builder);
    }
}
