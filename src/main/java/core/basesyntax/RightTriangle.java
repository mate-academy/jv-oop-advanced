package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg,int secondLeg) {
        this.setName("triangle");
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double obtainArea() {
        return this.firstLeg * this.secondLeg / 2;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", firstleg: " + this.getFirstLeg() + " units, secondleg: " + this.getSecondLeg() + " units, color: " + this.getColor());
    }
}
