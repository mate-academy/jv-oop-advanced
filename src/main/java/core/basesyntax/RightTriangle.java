package core.basesyntax;

public class RightTriangle extends Figure implements Drawable, AreaCalculator {
    private int firstLeg;
    private int secondLeg;

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
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
        return (double) (firstLeg * secondLeg) / 2;
    }
}
