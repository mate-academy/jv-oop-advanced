package core.basesyntax;

public class RightTriangle extends Figure implements Parametrs{
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String name,String color,double firstLeg, double secondLeg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        calculateArea();
    }
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public boolean isFlat() {
        return true;
    }

    @Override
    public boolean isSimple() {
        return false;
    }
}
