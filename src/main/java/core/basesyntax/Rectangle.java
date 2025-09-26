package core.basesyntax;

public class Rectangle extends Figure {
    private final int horizontalSide;
    private final int verticalSide;

    public Rectangle(int horizontalSide, int verticalSide, String color) {
        this.horizontalSide = horizontalSide;
        this.verticalSide = verticalSide;
        this.color = color;
        area = horizontalSide * verticalSide;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + area + " sq. units, horizontal side: "
                + horizontalSide + " sq. units, vertical side: "
                + verticalSide + " units, color: " + color;
    }
}
