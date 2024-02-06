package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + this.calculateArea() + " firstSide " + getFirstSide()
                + " secondSide " + getSecondSide() + " hight " + getHeight()
                + ", color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return height * (firstSide + secondSide) / 2;
    }
}
