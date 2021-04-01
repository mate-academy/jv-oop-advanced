package core.basesyntax;

public class IsoscelesTrapezoid extends Shapes {
    private int side;
    private int height;

    public IsoscelesTrapezoid(int side, int height, String color) {
        super(color);
        this.height = height;
        this.side = side;
    }

    @Override
    public String draw() {
        return ("Picture: " + ",area: " + getArea() + ",side length: " + side
                + ", height: " + height);
    }

    @Override
    public int getArea() {
        return side * height;
    }

    @Override
    String figure() {
        return "IsoscelesTrapezoid";
    }

    @Override
    void uniqueProperty() {
        System.out.println("Have 4 corners");
    }
}
