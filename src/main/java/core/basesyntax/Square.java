package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        setColor(color);
        this.side = side;
    }

    @Override
    public String name() {
        return "Square";
    }

    @Override
    public float getArea() {
        return side * side;
    }

    @Override
    public String printInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(name()).append(", area: ")
                .append(getArea()).append(" units, side: ")
                .append(side).append(" units, color: ")
                .append(getColor());
        return sb.toString();
    }
}
