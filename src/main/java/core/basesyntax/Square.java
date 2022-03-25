package core.basesyntax;

public class Square extends Figure implements Description, GetArea {
    private int side;
    private String name = "Square";

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void getDescription() {
        System.out.println("Name: " + name + " side: " + getSide() + " units "
                + " area: " + getArea() + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}

