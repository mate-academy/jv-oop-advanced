package core.basesyntax.model;

public class Square extends Figure {

    private final int side;

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
        StringBuilder builder = new StringBuilder("Figure:");
        builder.append(" square").append(COMMA)
                .append(" area: ").append(getArea()).append(WORD_SEPARATOR)
                .append("sq.units").append(COMMA)
                .append(" side: ").append(side).append(WORD_SEPARATOR)
                .append("units").append(COMMA)
                .append(" color: ").append(color);
        System.out.println(builder);
    }
}
