package core.basesyntax;

public class Square extends Figure {
    private int lengthSide;

    public Square(int lengthSide,String color) {
        super(color);
        this.lengthSide = lengthSide;
    }

    public double calculateArea() {
        return lengthSide * lengthSide;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: Square, area: "
                + calculateArea() + " sq. units,  lengthSide: "
                + lengthSide + ", color: " + getColor());
    }
}
