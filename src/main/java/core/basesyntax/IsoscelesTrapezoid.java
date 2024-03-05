package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperSide;
    private int downSide;
    private int height;

    public IsoscelesTrapezoid(String color, int upperSide, int downSide, int height) {
        super(color);
        this.upperSide = upperSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public String getArea() {
        return String.valueOf(((upperSide + downSide) * height) / 2);
    }

    @Override
    public String draw() {
        return "Figure: IsoscelesTrapezoid, area:" + getArea()
                + "sq. units, upperSide: " + upperSide
                + " units, downSide: " + downSide
                + " units, height: " + height
                + "units, color:" + super.draw();
    }
}
