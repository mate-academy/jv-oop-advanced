package core.basesyntax;

public class RightTriangle extends Figure implements InitializingProperties, DrawFigures {
    public int firstLeg = 0;
    public int secondLeg = 0;

    public RightTriangle(int firstLeg, int secondLeg) {
        super.name = "Right Triangle";
        super.color = getRandomColor();
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        getDraw();

    }

    @Override
    public double getArea() {

        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure : " + super.name + ", area : " + getArea()
                + " units, firstLeg : " + firstLeg + " secondLeg : " + secondLeg
                +" units, color : " + super.color);
    }
}
