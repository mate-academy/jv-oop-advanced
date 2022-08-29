package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (topBase + bottomBase) * height;
    }

    private String getFigureName() {
        String figureFullName = this.getClass().getName();
        int lastIdx = figureFullName.lastIndexOf('.');
        return figureFullName.substring(lastIdx + 1);
    }

    @Override
    public String draw() {
        return "Drowing a " + getFigureName();
    }

    @Override
    public String toString() {
        return "Figure: " + getFigureName() + ", area: " + getArea()
                + " sq.units, topBase: " + topBase + ", bottomBase: "
                + bottomBase + ", height: " + height + " units, color: "
                + getColor();
    }
}
