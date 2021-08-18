package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String name, String color) {
        super(name, color);
        this.length = (int)(Math.random() * 100);
        this.width = (int)(Math.random() * 100);
    }

    @Override
    public double getArea() {
        return (double)length * width;
    }

    @Override
    public String getDrow() {
        return "Figure: " + getName() + ", area: " + getArea() + " sq.units, "
                    + "length: " + length + " units, " + "width: "
                    + width + " units, " + "color: " + getColor();
    }
}
