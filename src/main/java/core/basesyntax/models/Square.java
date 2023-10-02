package core.basesyntax.models;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
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

