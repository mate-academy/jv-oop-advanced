package core.basesyntax;

public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle(int side1, int side2, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    @Override
    public double getArea() {
        return getSide1() * getSide2();
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area:" + getArea() + "sq. units, firstLeg:"
                + side1 + " units, secondLeg: " + side2 + "units, color: " + color);

    }
}
