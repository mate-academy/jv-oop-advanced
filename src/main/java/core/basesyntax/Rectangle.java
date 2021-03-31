package core.basesyntax;

public class Rectangle extends Figure implements Area {
    private int height;
    private int width;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + this.getArea() + " sq. units, width: " + this.height
                + " units, color: " + this.getColor();
    }
}
