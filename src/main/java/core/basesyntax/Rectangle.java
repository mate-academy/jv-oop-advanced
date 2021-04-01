package core.basesyntax;

public class Rectangle extends Shape {
    private int side1;
    private int side2;

    public Rectangle(int side1, int side2, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public String draw() {
        return ("Picture: " + ",area: " + getArea() + ",side1: " + side1 + " ,side2: " + side2);
    }

    @Override
    public int getArea() {
        return side1 * side2;
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
