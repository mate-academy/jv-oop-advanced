package core.basesyntax;

public class RightTriangle extends Figure {
    private int leg1;
    private int leg2;

    public RightTriangle(Color color, int leg1, int leg2) {
        super.setColor(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public float getArea() {
        float area = leg1 * leg2 / 2;
        return area;
    }

    @Override
    public void drawFigure(Figure randomFigure) {
        String info = "Figure: right triangle, area :" + getArea() + "sq. units, leg1: " + leg1
                + " units, leg2: " + leg2 + " units, color: " + getColor().name();
        System.out.println(info);
    }
}
