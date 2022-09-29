package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        this.setType("rectangle");
    }

    public double getArea() {
        return height * width;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getType() + ", area: " + getArea() + " units, height: "
                + height + " units, width: " + width + " units, color: " + getColor());
    }
}
