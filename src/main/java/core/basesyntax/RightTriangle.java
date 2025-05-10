package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstSide;
    private int secondSide;

    public RightTriangle(String color, int firstSide, int secondSide) {
        this.setColor(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return (double) (firstSide * secondSide) / 2;
    }

    @Override
    public void draw() {
        StringBuilder info = new StringBuilder();
        info.append("Figure: right triangle, area: ")
                .append(getArea()).append(" sq.units, first leg: ")
                .append(firstSide).append(" units, second leg: ")
                .append(secondSide).append(" units, color: ")
                .append(getColor());
        System.out.println(info);
    }
}
