package core.basesyntax;

public class Rectangle extends Figure implements Description, GetArea {
    private int high;
    private int length;
    private String name = "rectangle";

    public Rectangle(String color, int high, int length) {
        super(color);
        this.high = high;
        this.length = length;
    }

    public int getHigh() {
        return high;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void getDescription() {
        System.out.println("Name: " + name + " high: " + getHigh() + " units "
                + " length: " + getLength() + " units " + " area: " + getArea()
                + " sq. units " + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return high * length;
    }
}

