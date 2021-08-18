package core.basesyntax;

public class Rectangle extends Figure {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String name;
    private String color;
    private int length;
    private int width;

    public Rectangle() {
        this.name = "rectangle";
        this.color = colorSupplier.getRandomColor();
        this.length = (int)(Math.random() * 100);
        this.width = (int)(Math.random() * 100);
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
    public String drow() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units, "
                    + "length: " + length + " units, " + "width: "
                    + width + " units, " + "color: " + color;
    }
}
