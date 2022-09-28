package core.basesyntax;

public class Rectangle extends Figure {
    private int side;
    private int secondSide;

    public Rectangle(String color, int side, int secondSide) {
        setColor(color);
        this.side = side;
        this.secondSide = secondSide;
    }

    @Override
    public String name() {
        return "Rectangle";
    }

    @Override
    public float getArea() {
        return side * secondSide;
    }

    @Override
    public String printInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(name()).append(", area: ")
                .append(getArea()).append(" units, side: ")
                .append(side).append(" units, second side: ")
                .append(secondSide).append(", color: ")
                .append(getColor());
        return sb.toString();
    }
}
