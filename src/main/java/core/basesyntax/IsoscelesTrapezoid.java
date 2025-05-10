package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide, double height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

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

    @Override
    public double getArea() {
        double area = height * (firstSide + secondSide) / 2;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + this.getClass().getName() + ", area: " + this.getArea()
                + " sq.units, firstSide: " + this.getFirstSide() + " units, secondSide: "
                + this.secondSide + " units, height: " + this.height + " units. color: "
                + this.getColor());
    }
}
