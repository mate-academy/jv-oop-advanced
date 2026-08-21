package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append(" ----Figure: right triangle----")
                .append("\n area: " + calculateArea() + " sq. units")
                .append("\n first leg: " + firstLeg + " units")
                .append("\n second leg: " + secondLeg + " units")
                .append("\n color: " + getColor());
        System.out.println(builder);
    }

    @Override
    public double calculateArea() {
        return Math.floor((double) (firstLeg * secondLeg) / 2) * 10.0 / 10.0;
    }
}
