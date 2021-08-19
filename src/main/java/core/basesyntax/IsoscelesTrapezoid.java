package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int trapezoidBottomSide;
    private int trapezoidTopSide;
    private int trapezoidSide;

    public IsoscelesTrapezoid(String name, String color, int trapezoidBottomSide,
                              int trapezoidTopSide, int trapezoidSide) {
        super(name, color);
        this.trapezoidBottomSide = trapezoidBottomSide;
        this.trapezoidTopSide = trapezoidTopSide;
        this.trapezoidSide = trapezoidSide;
    }

    public int getTrapezoidBottomSide() {
        return trapezoidBottomSide;
    }

    public int getTrapezoidTopSide() {
        return trapezoidTopSide;
    }

    public int getTrapezoidSide() {
        return trapezoidSide;
    }

    @Override
    public double countArea() {
        int difference = (trapezoidTopSide - trapezoidBottomSide) / 2;
        difference = (difference < 0) ? difference * (-1) : difference;
        double height = Math.sqrt((difference * difference) + (trapezoidSide * trapezoidSide));
        double area = (trapezoidBottomSide + trapezoidTopSide) / 2 * height;
        return area;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName() + ", area: " + countArea() + ", bottom side: "
                + trapezoidBottomSide + ", top side: " + trapezoidTopSide + ", left side: "
                + trapezoidSide + ", right side: " + trapezoidBottomSide);
    }
}
