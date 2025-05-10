package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color,double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void toDraw() {
        StringBuilder str = new StringBuilder();
        System.out.println(str
                .append("Figure: square, area: ")
                .append(getArea())
                .append("sq. units, side: ")
                .append(side)
                .append("units, color: ")
                .append(color));
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
