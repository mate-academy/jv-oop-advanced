package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topLength;
    private double bottomLength;
    private double height;

    public IsoscelesTrapezoid(Colors color, double topLength, double bottomLength, double height) {
        super(color);
        this.topLength = (int)topLength;
        this.bottomLength = (int)bottomLength;
        this.height = (int)height;

    }

    public double getBottomLength() {
        return bottomLength;
    }

    public void setBottomLength(int bottomLength) {
        this.bottomLength = bottomLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea() {
        return (topLength + bottomLength) * height / 2;
    }

    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, topLength: "
                + (int) topLength + ", height: " + (int)height
                + ", bottomLength: " + (int)bottomLength + " units, color: " + color);
    }
}
