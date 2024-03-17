package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, Drawable {
    private float firstBasis;
    private float secondBasis;
    private float height;

    public void setFirstBasis(float firstBasis) {
        this.firstBasis = firstBasis;
    }

    public float getFirstBasis() {
        return firstBasis;
    }

    public void setSecondBasis(float secondBasis) {
        this.secondBasis = secondBasis;
    }

    public float getSecondBasis() {
        return secondBasis;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return ((firstBasis + secondBasis) / 2) * height;
    }

    @Override
    public void draw() {

        System.out.println("Figure: " + getClass().getSimpleName() + ", area - "
                + getArea() + "," + " firstBasis " + "- " + firstBasis + ","
                + " secondBasis " + "- " + secondBasis + "," + " height " + "- " + height
                + "," + " color - " + getColor());
    }
}
