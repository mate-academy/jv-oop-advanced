package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    protected Circle(int radius, Color color) {
        super(Math.PI * radius * radius, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    void draw() {
        System.out.println("Circle was drew");
    }

    @Override
    public Color getColor() {
        return ColorProducer.getColor();
    }

    @Override
    public String displayInfo() {
        return "Figure:Circle" + "," + "Color:" + getColor() + ","
                + "Area:" + getArea() + "," + "Radius:" + getRadius();
    }
}
