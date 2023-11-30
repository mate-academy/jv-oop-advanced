package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, Color color) {
        this.side = side;
        this.setColor(color);
    }

    @Override
    public double getArea() {

        return side * side;
    }

    @Override
    public void draw() {
        double area = getArea();
        System.out.println(new StringBuilder()
                .append("Figure: square, ")
                .append("area: ").append(area).append(" sq. units, ")
                .append("side: ").append(side).append(" units, ")
                .append("color: ").append(this.getColor())
                .toString());
    }
}
