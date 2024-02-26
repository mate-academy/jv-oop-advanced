package core.basesyntax;

public class RightTriangle extends Figure{
    private double base;
    private double height;


    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.base = firstLeg;
        this.height = secondLeg;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", square: "
                + getArea() + " sq. units, color: " + getColor()
                + ", base: " + base
                + ", height: " + height);

    }
}
