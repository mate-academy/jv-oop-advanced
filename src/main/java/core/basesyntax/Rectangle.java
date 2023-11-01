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
        double area = height * length;
        return "Figure: rectangle, area: "
                + area
                + " sq. units, height: "
                + " units, length: "
                + length
                + " units, height: "
                + height
                + " color: "
                + getColor();
    }
}
