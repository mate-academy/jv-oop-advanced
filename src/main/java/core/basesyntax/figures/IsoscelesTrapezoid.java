package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double bottomBase;
    private double topBase;

    public IsoscelesTrapezoid(String color, double height, double bottomBase, double topBase) {
        super(color);
        this.height = height;
        this.bottomBase = bottomBase;
        this.topBase = topBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public void setBottomBase(double bottomBase) {
        this.bottomBase = bottomBase;
    }

    public double getTopBase() {
        return topBase;
    }

    public void setTopBase(double topBase) {
        this.topBase = topBase;
    }

    @Override
    public double calculateArea() {
        return height * ((bottomBase + topBase) * 0.5);
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid{"
                + "height=" + height
                + ", bottomBase=" + bottomBase
                + ", topBase=" + topBase
                + ", color='" + getColor()
                + ", area='" + calculateArea()
                + '}');
    }
}
