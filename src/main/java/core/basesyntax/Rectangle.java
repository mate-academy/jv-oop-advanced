package core.basesyntax;
public class Rectangle extends Figure implements Drawable,Area {
    private int width;
    private int length;
    public Rectangle(String color, int width, int length) {
        setColor(color);
        this.width = width;
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return (width * length);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "rectangle, " + "area: " + getArea()
                + " sq. units, " + "width: " + width + " units, " + "length: "
                + length + " units, " + "color: " + getColor());
    }
}