package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstAdjoining;
    private double secondAdjoining;

    public RightTriangle(double firstAdjoining, double secondAdjoining, MyColor color) {
        super(color.name());
        this.firstAdjoining = firstAdjoining;
        this.secondAdjoining = secondAdjoining;
    }

    public double getFirstAdjoining() {
        return firstAdjoining;
    }

    public void setFirstAdjoining(double firstAdjoining) {
        this.firstAdjoining = firstAdjoining;
    }

    public double getSecondAdjoining() {
        return secondAdjoining;
    }

    public void setSecondAdjoining(double secondAdjoining) {
        this.secondAdjoining = secondAdjoining;
    }

    @Override
    public double getArea() {
        return firstAdjoining * secondAdjoining;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, First Adjoining: "
                + firstAdjoining + " Triangle Second Adjoining: "
                + secondAdjoining + " units, color: " + getColor());
    }
}
