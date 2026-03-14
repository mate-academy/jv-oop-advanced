public class Rectangle implements Figure {
    private double width;
    private double height;
    private String color;

    public Rectangle(String color, double width, double height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units"
                + ", width: " + width + " units"
                + ", height: " + height + " units"
                + ", color: " + color);
    }
}
