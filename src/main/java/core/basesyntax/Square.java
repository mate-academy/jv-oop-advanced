package core.basesyntax;

class Square extends Figure {
    private int leg;

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getLeg() {
        return leg;
    }

    @Override
    public Double area() {
        return (double) leg * leg;
    }

    @Override
    public void info() {
        System.out.println("Figure: square, area: " + area() + " sq. units, leg: " + leg
                + " units, color: " + getColor());
    }
}
