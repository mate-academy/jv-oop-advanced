package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        StringBuilder str = new StringBuilder("Figure: ");
        str.append("square").append(", ")
                .append("area: ").append(side * side).append(" sq.units, ")
                .append("side: ").append(side).append(" units, ")
                .append("color: ").append(getColor());
        System.out.println(str.toString());
    }
}
