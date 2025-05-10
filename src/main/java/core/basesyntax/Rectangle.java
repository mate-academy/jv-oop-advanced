package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    @Override
    public String drawArea() {
        return "Figure: rectangle, "
                + "area: " + length * width + " sq. units, "
                + "length: " + length + " units, "
                + "width: " + width + " units, "
                + "color: " + getColor()
                + '}';
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
