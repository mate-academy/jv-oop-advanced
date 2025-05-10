package core.basesyntax;

public class Square extends Figure {
    private int siteA;

    public Square(String color, int siteA) {
        super(color);
        this.siteA = siteA;
    }

    @Override
    public double getArea() {
        return siteA * siteA;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area " + getArea() + " sq.units, "
                + "siteA " + siteA + " units, "
                + "color: " + getColor());
    }

    public void setSiteA(int siteA) {
        this.siteA = siteA;
    }

    public int getSiteA() {
        return siteA;
    }
}
