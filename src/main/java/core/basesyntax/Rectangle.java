package core.basesyntax;

public class Rectangle extends Figure {

    private double firstSide;
    private double secondSide;



    public void setSides (double firstSide, double secondSide) {
        if (firstSide <= 0 || secondSide <= 0) {
            firstSide = 1;
            secondSide = 2;
        }
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    @Override
    public void setArea() {
        this.area = firstSide * secondSide;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: rectangle, area: " + area + " sq. units, sides: "
                + getFirstSide() + " units and " + getSecondSide() + " units, color: " + getColor());
    }
}
