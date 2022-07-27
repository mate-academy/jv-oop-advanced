package core.basesyntax.models;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return getSide() * getSide();
    }

    @Override
    public String printInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Figure: square, radius - ")
                .append(getSide())
                .append(" units, color - ")
                .append(getColor())
                .append(", area - ")
                .append(area())
                .append(" sq.units");
        return info.toString();
    }
}
