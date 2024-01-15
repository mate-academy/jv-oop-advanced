package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int higth;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHigth(int higth) {
        this.higth = higth;
    }

    @Override
    public double getArea() {
        return width * higth;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle "
                + ", area: "
                + getArea()
                + " sq.units"
                + ", higth: "
                + higth
                + " units"
                + ", width: "
                + width
                + ", color: "
                + getColor());
    }
}
