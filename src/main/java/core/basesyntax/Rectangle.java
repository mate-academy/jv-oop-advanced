package core.basesyntax;

public class Rectangle extends Figure {

    private double base;
    private double height;

    Rectangle(double base, double height, Color color) {
        setBase(base);
        setHeight(height);
        setColor(color);
        setArea(base, height);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setArea(double width, double height) {
        super.setArea(width * height);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(Color color) {
        super.setColor(color);
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + getArea() + " sq. units"
                + " height: " + getHeight() + " units, width: "
                + getBase() + " units, color: " + getColor();
    }
}
