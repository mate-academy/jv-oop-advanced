package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.color = color;
    }

    @Override
    public void draw() {
        info.append("Figure: Rectangle, area: ")
                .append(getArea())
                .append(" sq.units, first side: ")
                .append(firstSide)
                .append(" units, second side: ")
                .append(secondSide)
                .append(" units, color: ")
                .append(color);
        System.out.println(info.toString());
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
