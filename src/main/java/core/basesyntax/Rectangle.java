package core.basesyntax;

class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    @Override
    public Double area() {
        return (double) firstLeg * secondLeg;
    }

    @Override
    public void info() {
        System.out.println("Figure: rectangle, area: " + area() + " sq. units, first leg: "
                + firstLeg + ", second leg: " + secondLeg
                + " units, color: " + getColor());
    }
}
