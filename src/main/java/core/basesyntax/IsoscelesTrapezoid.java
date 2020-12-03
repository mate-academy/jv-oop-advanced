package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawing {
    private double foundation1;
    private double foundation2;
    private double heigth;

    public IsoscelesTrapezoid(String color, double foundation1, double foundation2, double heigth) {
        super(color);
        this.foundation1 = foundation1;
        this.foundation2 = foundation2;
        this.heigth = heigth;
    }

    public double getFoundation1() {
        return foundation1;
    }

    public void setFoundation1(double foundation1) {
        this.foundation1 = foundation1;
    }

    public double getFoundation2() {
        return foundation2;
    }

    public void setFoundation2(double foundation2) {
        this.foundation2 = foundation2;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public double getArea() {
        return (foundation1 + foundation2) / 2 * heigth;
    }

    @Override
    public void draw() {
        System.out.println(("Shape: Isosceles Trapezoid, area: " + getArea()
                + " . units, radius :" + getHeigth()
                + "5 units,+ color: " + getColor()));
    }

}
