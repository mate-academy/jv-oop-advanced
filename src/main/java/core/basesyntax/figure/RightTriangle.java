package core.basesyntax.figure;

public class RightTriangle extends Figure {

    private int firstLeg = 0;
    private int secondLeg = 0;

    public RightTriangle(String name) {
        setName(name);
        randomFigure();
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public void resultArea() {
        setArea((getFirstLeg() * getSecondLeg()) / 2);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", firstLeg: " + firstLeg + " units, "
                + "secondLeg: " + secondLeg + " units, " + "color: " + getColor());
    }

    @Override
    public void randomFigure() {
        super.randomFigure();
        setFirstLeg(randomSideFigure());
        setSecondLeg(randomSideFigure());
        resultArea();
    }
}
