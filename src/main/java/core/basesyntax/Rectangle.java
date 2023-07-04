package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle() {
    }

    public Rectangle(String color, double firstSide, double secondSide, double thirdSide) {
        this.setColor(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        StringBuilder info = new StringBuilder();
        info.append("Figure: triangle, area: ")
                .append(getArea()).append(" sq.units, first side: ")
                .append(firstSide).append(" units, second side: ")
                .append(secondSide).append(" units, color: ")
                .append(getColor());
        System.out.println(info);
    }
}
