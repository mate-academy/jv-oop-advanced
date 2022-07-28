package core.basesyntax.models;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
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
                .append(getArea())
                .append(" sq.units");
        return info.toString();
    }
}
