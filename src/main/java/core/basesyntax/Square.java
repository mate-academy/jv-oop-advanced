package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        setColor(color);
        setName(Figures.SQUARE.name());
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: ");
        builder.append(getName())
                .append(", ")
                .append("area: ")
                .append(getArea())
                .append("sq. units, ")
                .append("side: ")
                .append(side)
                .append(" units, ")
                .append("color: ")
                .append(getColor());
        System.out.println(builder.toString());
    }
}
