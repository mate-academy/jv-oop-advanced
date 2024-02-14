package core.basesyntax;

class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Rectangle(int a, int b, String str) {
        this.firstLeg = a;
        this.secondLeg = b;
        setColor(str);
    }

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
    public Double calculateArea() {
        return (double) firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea()
                + " sq. units, first leg: "
                + firstLeg + ", second leg: " + secondLeg
                + " units, color: " + getColor());
    }
}
