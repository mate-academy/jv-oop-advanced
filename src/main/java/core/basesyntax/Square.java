package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {
        super();
        setName(FigureType.SQUARE);
        this.side = 1;
    }

    public Square(FigureType name, String color, double side) {
        super(name, color);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toDraw() {
        StringBuilder builder = new StringBuilder();
        return builder.append(super.toDraw()).append(", side: ").append(side)
                .append(", area: ").append(getArea()).toString();
    }
}
