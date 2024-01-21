package core.basesyntax;

public class Rectangle extends Figure {

    private int height;
    private int length;

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String info() {
        return "Figure: rectangle, area: "
                + getArea()
                + " sq. units, length: "
                + length
                + " units, height: "
                + height
                + " units, color: "
                + getColor();
    }

    @Override
    public double getArea() {
        return height * length;
    }
}
