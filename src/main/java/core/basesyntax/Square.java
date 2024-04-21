package core.basesyntax;

public class Square extends Figure {
    private int said;
    private String color;

    public Square(int said, String color) {
        this.said = said;
        this.color = color;
    }

    @Override
    public int getArea() {
        return said * said;
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + getArea() + " sq. units, side: "
                + said + " units, color: " + color;
    }
}
