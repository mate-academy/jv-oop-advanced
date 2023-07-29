package core.basesyntax;

public class IsoscelesTrapezoid extends Shape {
    private int height;
    private int firstMainPart;
    private int secondMainPart;

    public IsoscelesTrapezoid(String color, int height, int firstMainPart, int secondMainPart) {
        super(color);
        this.firstMainPart = firstMainPart;
        this.secondMainPart = secondMainPart;
    }

    @Override
    public int figureArea() {
        return ((firstMainPart + secondMainPart) / 2) * height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, area: " + figureArea()
                + " sq. units, upper base: " + firstMainPart
                + " units, lower base: " + secondMainPart
                + " units, height: " + height + " units, color: " + color);
    }
}
