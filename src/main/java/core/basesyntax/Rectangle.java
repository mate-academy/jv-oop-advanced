package core.basesyntax;

public class Rectangle extends Shape {
    private int sideFirst;
    private int sideSecond;

    public Rectangle(int sideFirst, int sideSecond, String color) {
        super(color);
        this.sideFirst = sideFirst;
        this.sideSecond = sideSecond;
    }

    @Override
    public String draw() {
        return ("Figure: " + figure() + " ,area: " + getArea() + ",sideFirst: " + sideSecond
                + " ,sideSecond: " + sideSecond);
    }

    @Override
    public int getArea() {
        return sideFirst * sideSecond;
    }

    @Override
    public String figure() {
        return "Rectangle";
    }

    @Override
    void uniqueProperty() {
        System.out.println("Have 4 corners");
    }
}
