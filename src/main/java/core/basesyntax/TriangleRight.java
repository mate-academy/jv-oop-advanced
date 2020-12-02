package core.basesyntax;

public class TriangleRight extends Figure {

    private double height;
    private double base;

    TriangleRight(double height, double base, Color color) {
        setHeight(height);
        setBase(base);
        setColor(color);
        setArea(getHeight(),getBase());
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

    @Override
    public double getArea() {
        return super.getArea();
    }

    public void setArea(double height, double base) {
        super.setArea((0.5) * height * base);
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
        return "Figure: right triangle, area: " + getArea() + " sq. units"
                + " hypotenuse: " + getHypotenuse(getHeight(), getBase()) + " units, base: "
                + getBase() + " units, color: " + getColor();
    }

    private double getHypotenuse(double height, double base) {
        return Math.sqrt(Math.pow(height,2) + Math.pow(base,2));
    }
}
