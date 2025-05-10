package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(Color color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder("Figure: ");
        sb.append("rectangle, ")
                .append("area: ")
                .append(calculateArea())
                .append(" sq. units,")
                .append(" firstSide: ")
                .append(firstSide)
                .append(" units,")
                .append(" secondSide: ")
                .append(secondSide)
                .append(" units,")
                .append(" color: ")
                .append(getColor().name());

        System.out.println(sb);
    }
}
