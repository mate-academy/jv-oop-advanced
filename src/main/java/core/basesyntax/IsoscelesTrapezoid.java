package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int middleLine;
    private int heights;

    public IsoscelesTrapezoid(int middleLine, int heights, Color color) {
        super.color = color;
        this.middleLine = middleLine;
        this.heights = heights;
    }

    public IsoscelesTrapezoid() {
    }

    @Override
    public double getArea() {
        return middleLine * heights;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid area = " + getArea() + ", color: " +
                color.name() + ", middleLine: " + middleLine + ", heights: " + heights);
    }
}
