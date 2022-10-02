package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int lowerBase;
    private int upperBase;

    public IsoscelesTrapezoid(Color color, int height, int lowerBase, int upperBase) {
        super.setColor(color);
        this.height = height;
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;

    }

    @Override
    public float getArea() {
        float area = (lowerBase + upperBase) / 2 * height;
        return area;
    }

    @Override
    public void drawFigure(Figure randomFigure) {
        String figureInfo = "Figure: isosceless trapezoid, area :" + getArea()
                + "sq. units, height: " + height
                + " lower base : " + lowerBase + " units, upper base: "
                + upperBase + " units, color: " + getColor();
        System.out.println(figureInfo);
    }
}
