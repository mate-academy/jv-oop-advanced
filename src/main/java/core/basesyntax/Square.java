package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder()
                .append("Figure: square, ")
                .append("area: ").append(getArea()).append(" sq. units, ")
                .append("side: ").append(side).append(" units, ")
                .append("color: ").append(this.getColor())
                .toString());
    }
}
