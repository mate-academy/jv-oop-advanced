package core.basesyntax.model;

public class Square extends Figure {
    private int side;

    public double getArea() {
        return side * side;
    }

    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(System.lineSeparator()).append(
                "This is a SQUARE ")
                .append(System.lineSeparator()).append("Color is ").append(getColor())
                .append(System.lineSeparator()).append("Side A = ").append(side)
                .append(System.lineSeparator()).append("Area = ").append(getArea()).toString());
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
