package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(FigureType.SQUARE, color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.append("Figure: ").append(getName())
                .append(", color: ").append(getColor()).append(", side: ").append(side)
                .append(", area: ").append(getArea()).toString());
    }
}
