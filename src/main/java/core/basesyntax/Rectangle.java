package core.basesyntax;

public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle(Color color, int side1, int side2) {
        super.setColor(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public float getArea() {
        float area = side1 * side2;
        return area;
    }

    @Override
    public void drawFigure(Figure randomFigure) {
        String info = "Figure: rectangle, area: " + getArea() + "sq. units, side1: " + side1
                + " units, side2: " + side2 + " units, color: " + getColor().name();
        System.out.println(info);
    }
}
