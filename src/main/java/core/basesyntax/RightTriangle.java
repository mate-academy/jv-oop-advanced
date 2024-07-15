package core.basesyntax;

class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + " the first leg is: "
                + firstLeg
                + " and the second leg is: "
                + secondLeg
                + ", the color is: "
                + color);
    }
}
