public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
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
    public double calculateArea() {
        return base * height / 2;
    }

    @Override
    public String printInfo() {
        return "Figure: right triangle, area: " + calculateArea()
                + " sq.units, base: " + base
                + " units, heigth: " + height
                + " units, color: " + super.getColor();
    }
}
