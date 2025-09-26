package core.basesyntax;

public class Rectangle extends Figure {
    private final int horizontalSide;
    private final int verticalSide;

    public Rectangle(int horizontalSide, int verticalSide, String color) {
        this.horizontalSide = horizontalSide;
        this.verticalSide = verticalSide;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, horizontal side: "
                + horizontalSide + " units, vertical side: "
                + verticalSide + " units, color: " + color);
    }

    @Override
    public float getArea() {
        return horizontalSide * verticalSide;
    }
}
