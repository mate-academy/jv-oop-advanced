package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public void circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius;
    }

    @Override
    public Color getColor() {
        return ColorProducer.getColor();
    }

    @Override
    public String displayInfo() {
        return "Figure:Circle" + "," + "Color:" + getColor() + ","
                + "Area:" + getArea() + "," + "Radius:" + radius;
    }
}
