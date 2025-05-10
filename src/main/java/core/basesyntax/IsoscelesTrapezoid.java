package core.basesyntax;

public class IsoscelesTrapezoid extends Shape {
    private int side;
    private int height;

    public IsoscelesTrapezoid(int side, int height, String color) {
        super(color);
        this.height = height;
        this.side = side;
    }

    @Override
    public String draw() {
        return ("Figure: " + figure() + " ,area: " + getArea() + ",side length: " + side
                + ", height: " + height);
    }

    @Override
    public int getArea() {
        return side * height;
    }

    @Override
    public String figure() {
        return "IsoscelesTrapezoid";
    }

    @Override
    void uniqueProperty() {
        System.out.println("Have 4 corners");
    }
}
