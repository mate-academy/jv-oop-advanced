package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(double topSide, double bottomSide, double height, String color) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    public double getTopSide() {
        return topSide;
    }

    public void setTopSide(double topSide) {
        this.topSide = topSide;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(double bottomSide) {
        this.bottomSide = bottomSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getArea() {
        return (topSide + bottomSide) / 2 * height;
    }
    
    public void draw() {
        System.out.println("Figure - isosceles trapezoid, color - " + getColor()
                + ", area - " + getArea()
                + ", top side - " + topSide
                + ", bottom side - " + bottomSide
                + ", height - " + height);
    }
}
