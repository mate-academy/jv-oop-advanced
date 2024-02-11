package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getPrint() {
        return "Figure: square, area: " + getArea() + "sq. units, " + " side: "
                + side + " units, " + "color: " + getColor();
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
