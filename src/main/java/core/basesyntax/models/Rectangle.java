package core.basesyntax.models;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        this.firstSide = firstSide > 0 ? firstSide : 1;
        this.secondSide = secondSide > 0 ? secondSide : 1;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String draw() {
        StringBuilder info = new StringBuilder();
        info.append("rectangle, area: ").append(getArea())
                .append(" sq.units, first side: ").append(firstSide)
                .append(" units, second side: ").append(secondSide)
                .append(" units, color: ").append(getColor());
        return info.toString();
    }
}
