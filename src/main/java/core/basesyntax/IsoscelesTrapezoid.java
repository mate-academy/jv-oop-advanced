package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperWidth;
    private double lowerWidth;
    private double height;

    public IsoscelesTrapezoid(Color color, double upperWidth, double lowerWidth, double height) {
        super(color);
        this.upperWidth = upperWidth;
        this.lowerWidth = lowerWidth;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (upperWidth + lowerWidth) * height;
    }

    public double getUpperWidth() {
        return upperWidth;
    }

    public void setUpperWidth(double upperWidth) {
        this.upperWidth = upperWidth;
    }

    public double getLowerWidth() {
        return lowerWidth;
    }

    public void setLowerWidth(double lowerWidth) {
        this.lowerWidth = lowerWidth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String draw() {
        return "Figure: " + FigureName.ISOSCELESTRAPEZOID.name() + " area: " + calculateArea()
                + " upper width: " + this.upperWidth + " lower width: " + this.lowerWidth
                + " height: " + this.height + " color: " + getColor().name();
    }
}
