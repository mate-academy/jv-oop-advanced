package core.basesyntax;

public class Rectangle extends Figure {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String name = "rectangle";
    private String color = colorSupplier.getRandomColor();
    private int length = (int)(Math.random() * 100);
    private int width = (int)(Math.random() * 100);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq.units, "
                    + "length: " + length + " units, " + "width: "
                    + width + " units, " + "color: " + color);
    }
}
