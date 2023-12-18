package core.basesyntax;

public class Rectangle extends Figure {
    private int high;
    private int length;

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
        System.out.println("Name: rectangle" + " high: " + getHigh() + " units "
                + " length: " + getLength() + " units " + " area: " + getArea()
                + " sq. units " + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return high * length;
    }
}

