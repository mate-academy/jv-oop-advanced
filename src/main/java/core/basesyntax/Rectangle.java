package core.basesyntax;

public class Rectangle extends Figure {
    private double topline;
    private double bottomline;

    public Rectangle(String color, double topline, double bottomline) {
        super(color);
        this.topline = topline;
        this.bottomline = bottomline;
    }

    public double getTopline() {
        return topline;
    }

    public double getBottomline() {
        return bottomline;
    }

    @Override
    public double getArea() {
        return topline * bottomline;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle "
                + "area: " + getArea() + " sq. units, "
                + "topline: " + topline + " units, "
                + "bottomline: " + bottomline + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
