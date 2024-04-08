package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder("Figure: ");
        sb.append("squere, ")
                .append("area: ")
                .append(calculateArea())
                .append(" sq. units,")
                .append(" side: ")
                .append(side)
                .append(" units,")
                .append(" color: ")
                .append(getColor().name());

        System.out.println(sb);
    }
}
