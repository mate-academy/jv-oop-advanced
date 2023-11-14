package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topline;
    private double bottomline;
    private double height;

    public IsoscelesTrapezoid(String color, double topline, double bottomline, double height) {
        super(color);
        this.topline = topline;
        this.bottomline = bottomline;
        this.height = height;
    }

    public double getTopline() {
        return topline;
    }

    public double getBottomline() {
        return bottomline;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (topline + bottomline) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid "
                + "area: " + getArea() + " sq. units, "
                + "topline: " + topline
                + " bottomline " + bottomline
                + " height " + height
                + " Color: " + getColor().toLowerCase());
    }
}
