package core.basesyntax.models;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
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
