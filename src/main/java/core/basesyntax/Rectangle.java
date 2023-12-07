package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, Color color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder()
                .append("Figure: rectangle, ")
                .append("area: ").append(getArea()).append(" sq. units, ")
                .append("first side: ").append(firstSide).append(" units, ")
                .append("second side: ").append(secondSide).append(" units, ")
                .append("color: ").append(this.getColor())
                .toString());
    }
}
