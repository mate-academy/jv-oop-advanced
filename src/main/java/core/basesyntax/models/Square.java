package core.basesyntax.models;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        this.side = side > 0 ? side : 1;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        StringBuilder info = new StringBuilder();
        info.append("square, area: ").append(getArea())
                .append(" sq.units, side: ").append(side)
                .append(" units, color: ").append(getColor());
        return info.toString();
    }
}

