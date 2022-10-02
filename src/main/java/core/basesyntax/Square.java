package core.basesyntax;

public class Square extends Figure {
    private final int side;
    private String type;

    public Square(String color, int side) {
        super(color);
        this.side = side;
        this.setType("square");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getType() + ", area: " + getArea() + " units, side: " + side
                + " units, color: " + getColor());
    }
}
