package figeres;

public class IsoscelesTrapezoid extends Figure implements Drawable {
    private int height;
    private int topLeg;
    private int bottomLeg;

    public IsoscelesTrapezoid(String color, int height, int topLeg, int bottomLeg) {
        super(color);
        this.height = height;
        this.topLeg = topLeg;
        this.bottomLeg = bottomLeg;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getTopLeg() {
        return topLeg;
    }

    public void setTopLeg(int topLeg) {
        this.topLeg = topLeg;
    }

    public int getBottomLeg() {
        return bottomLeg;
    }

    public void setBottomLeg(int bottomLeg) {
        this.bottomLeg = bottomLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units"
                + ", height: " + getHeight() + " units"
                + ", topLeg: " + getTopLeg() + " units"
                + ", bottomLeg: " + getBottomLeg() + " units"
                + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        return height * (topLeg + bottomLeg) / 2.0;
    }
}
