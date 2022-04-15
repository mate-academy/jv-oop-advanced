package core.basesyntax;

public class Rectangle extends Figure implements Area {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toDraw() {
        return "Figure: rectangle, area: "
                + Math.ceil(getArea() * Math.pow(10, 1)) / Math.pow(10, 1)
                + " sq.units, width: "
                + width
                + " units, height: "
                + height
                + " units, color: "
                + getColor().toLowerCase();
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
