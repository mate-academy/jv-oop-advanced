package core.basesyntax;

public class Square extends Figure {
    private int lengthSide;

    public Square(int lengthSide,String color) {
        this.lengthSide = lengthSide;
        setColor(color);
    }

    public double calculateArea() {
        return lengthSide * lengthSide;
    }

    @Override
    public void getPrintInfo() {
        System.out.println("Figure: Square, area: "
                + calculateArea() + " sq. units,  lengthSide: "
                + lengthSide + ", color: " + getColor());
    }
}
