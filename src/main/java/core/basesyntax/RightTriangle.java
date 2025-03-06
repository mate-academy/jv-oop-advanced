package core.basesyntax;

public class RightTriangle extends Figure implements Area {
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
        if (firstLeg > 0) this.firstLeg = firstLeg;
        else System.out.println("Bok nie może być mniejszy od 0");
    }
    public double getSecondLeg() {
        return this.secondLeg;
    }
    public void setSecondLeg(double secondLeg) {
        if (secondLeg > 0) this.secondLeg = secondLeg;
        else System.out.println("Bok nie może być mniejszy od 0");
    }
    @Override
    public double getArea() {  // metoda statyczna
        return (firstLeg * secondLeg) / 2;
    }
    @Override
    public String toString() {
        System.out.println("RightTriangle color: " + getColor() + " Długość pierwszej nogi: " + getFirstLeg() + " Długość drugiej nogi: " + getSecondLeg());
        return super.toString();
    }
}
