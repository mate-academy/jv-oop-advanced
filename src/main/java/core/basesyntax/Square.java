package core.basesyntax;

public class Square extends Figure {
    private Integer side;

    public Square(Integer side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return String.format(Pen.template, Shape.SQUARE.name().toLowerCase(), getArea(),
                String.format("side: %d units", side),
                this.getColor());
    }
}
