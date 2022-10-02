package core.basesyntax;

public class Rectangle extends Figure {
    private final int height;
    private final int width;
    private String type;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
        this.setType("rectangle");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getType() + ", area: " + getArea() + " units, height: "
                + height + " units, width: " + width + " units, color: " + getColor());
    }
}
