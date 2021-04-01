package core.basesyntax;

public class RightTriangle extends Shape {
    private int height;
    private int leg;

    public RightTriangle(int height, int leg, String color) {
        super(color);
        this.height = height;
        this.leg = leg;
    }

    @Override
    public String draw() {
        return ("Figure: " + figure() + " ,area: " + getArea() + "leg length: " + leg);
    }

    @Override
    public int getArea() {
        return height * leg;
    }

    @Override
    public String figure() {
        return "RightTriangle";
    }

    @Override
    void uniqueProperty() {
        System.out.println("Have 3 corners");
    }
}
