package core.basesyntax;

public class RightTriangle extends Figure implements Area, Draw {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color randomColor, double v, double v1) {
        super.setColor(randomColor);
        this.firstLeg = v;
        this.secondLeg = v1;
    }

    public double getFirstLeg() {
        return this.firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        if (firstLeg > 0) {
            this.firstLeg = firstLeg;
        } else {
            System.out.println("Side cannot be less than 0");
        }
    }

    public double getSecondLeg() {
        return this.secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        if (secondLeg > 0) {
            this.secondLeg = secondLeg;
        } else {
            System.out.println("Side cannot be less than 0");
        }
    }

    @Override
    public double getArea() {  // metoda statyczna
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void toDraw() {
        System.out.println("RightTriangle color: " + getColor() + " Length of first leg: " + getFirstLeg() + " Length of second leg: " + getSecondLeg());
    }
}
