package core.basesyntax;

public class Square extends Figure implements FigureDraw, AreaCalculator {
    private double side;
    private String name = "Square";

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder squareInfo = new StringBuilder();
        squareInfo
                .append("Figure: ")
                .append(name)
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, side: ")
                .append(side)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(squareInfo);
    }
}
