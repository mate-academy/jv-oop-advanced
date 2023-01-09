package core.basesyntax;

public class RigtTriangle extends Figure implements Area {
    private int firstLeg;
    private int secondLeg;
    public int getFirstLeg() {return firstLeg; }
    public void setFirstLeg(int firstLeg) {this.firstLeg = firstLeg; }
    public int getSecondLeg() {return secondLeg; }
    public void setSecondLeg(int secondLeg) {this.secondLeg = secondLeg; }
    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
