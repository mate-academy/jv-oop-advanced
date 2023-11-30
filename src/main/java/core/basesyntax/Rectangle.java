package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, Color color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        double area = getArea();
        System.out.println(new StringBuilder()
                .append("Figure: rectangle, ")
                .append("area: ").append(area).append(" sq. units, ")
                .append("first side: ").append(firstSide).append(" units, ")
                .append("second side: ").append(secondSide).append(" units, ")
                .append("color: ").append(this.getColor())
                .toString());
    }
}
