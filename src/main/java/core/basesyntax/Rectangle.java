package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super.setColor(color);
        super.setName("rectangle");
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return (double)length * width;
    }

    @Override
    public void drow() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq.units, "
                    + "length: " + length + " units, " + "width: "
                    + width + " units, " + "color: " + getColor());
    }
}
