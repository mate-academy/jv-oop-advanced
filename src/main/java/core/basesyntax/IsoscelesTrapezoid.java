package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private int middleLine;
    private int heights;
    private Color color;

    public IsoscelesTrapezoid(int middleLine, int heights, Color color) {
        this.color = color;
        this.middleLine = middleLine;
        this.heights = heights;
    }

    @Override
    public double getArea() {
        return middleLine * heights;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid area = " + getArea() + ", color: "
                + color.name() + ", middleLine: " + middleLine + ", heights: " + heights);
    }
}
