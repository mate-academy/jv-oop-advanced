package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topLength;
    private int bottomLength;
    private int height;

    public IsoscelesTrapezoid(Color color, int topLength, int bottomLength, int height) {
        super(color);
        this.topLength = topLength;
        this.bottomLength = bottomLength;
        this.height = height;
    }

    public double getArea() {
        return (topLength + bottomLength) * height / 2.0;
    }

    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, topLength: "
                + topLength + ", height: " + height
                + ", bottomLength: " + bottomLength + " units, color: " + getColor());
    }
}
