package core.basesyntax;

public class Rectangle extends Figure {
    private Double width;
    private Double height;

    public Rectangle(Double width, Double height, String color) {
        super(color, FigureType.RECTANGLE);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, width: " + width
                + " units, height: " + height
                + " units, color: " + getColor() + "\n");
    }
}
