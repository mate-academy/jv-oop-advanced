package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.append("Figure: Square, ").append("area: ")
                .append(getArea()).append(" sq.units, side: ")
                .append(side).append(" units, color: ")
                .append(getColor()));
    }
}
