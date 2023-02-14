package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double hypotenuse;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(FigureType.RIGHTTRIANGLE, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.hypotenuse = Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2));
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.append("Figure: ").append(getName())
                .append(", color: ").append(getColor()).append(", first leg: ").append(firstLeg)
                .append(", second leg: ").append(secondLeg).append(", hypotenuse: ")
                .append(hypotenuse).append(", area: ").append(getArea()).toString());
    }
}
