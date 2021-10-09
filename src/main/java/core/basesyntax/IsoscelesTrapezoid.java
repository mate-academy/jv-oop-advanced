package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int botSide;
    private int height;

    public IsoscelesTrapezoid(int topSide, int botSide, int height, String color) {
        this.topSide = topSide;
        this.botSide = botSide;
        this.height = height;
        super.setType("Isosceles trapezoid");
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return ((topSide + botSide) / 2.0) * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %s sq.units, top side: %s units, "
                        + "bottom side: %s units, height: %s, color: %s%n",
                getType(), getArea(), topSide, botSide, height, getColor());
    }
}
