package core.basesyntax;

public class Rectangle extends Figure {
    private double siteA;
    private double siteB;

    public Rectangle(String color, int siteA, int siteB) {
        super(color);
        this.siteA = siteA;
        this.siteB = siteB;
    }

    public double getSiteA() {
        return siteA;
    }

    public void setSiteA(int siteA) {
        this.siteA = siteA;
    }

    public double getSiteB() {
        return siteB;
    }

    public void setSiteB(int siteB) {
        this.siteB = siteB;
    }

    @Override
    public double getArea() {
        return siteA * siteB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area " + getArea() + " sq.units, "
                + "siteA " + siteA + " units, "
                + "siteB " + siteB + " units, "
                + "color: " + getColor());
    }
}
