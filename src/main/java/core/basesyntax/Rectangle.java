package core.basesyntax;

public class Rectangle extends Figure {
    private int siteOne;
    private int siteTwo;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.siteOne = sideA;
        this.siteTwo = sideB;
    }

    public int getSiteOne() {
        return siteOne;
    }

    public int getSiteTwo() {
        return siteTwo;
    }

    public void setSiteOne(int siteOne) {
        this.siteOne = siteOne;
    }

    public void setSiteTwo(int siteTwo) {
        this.siteTwo = siteTwo;
    }

    @Override
    public double getArea() {
        return siteOne * siteTwo;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area " + getArea() + " sq.units, "
                + "firstLeg " + siteOne + " units, "
                + "secondLeg " + siteTwo + " units, "
                + "color: " + getColor());
    }
}
