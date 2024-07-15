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
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: the first leg is ")
                .append(firstLeg)
                .append(" and the second leg is ")
                .append(secondLeg)
                .append(" the color is: ")
                .append(color);
        System.out.println(builder.toString());
    }
}
