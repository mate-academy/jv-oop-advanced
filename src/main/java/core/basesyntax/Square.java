package core.basesyntax;

class Square extends Figure {
    private int leg;

    public Square(int a, String str) {
        this.leg = a;
        setColor(str);
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getLeg() {
        return leg;
    }

    @Override
    public Double calculateArea() {
        return (double) leg * leg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + calculateArea()
                + " sq. units, leg: " + leg
                + " units, color: " + getColor());
    }
}
