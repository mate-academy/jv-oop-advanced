package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLine;
    private double secondLine;

    public RightTriangle(String color, double firstLeg, double secondLeg){
        super(color);
        this.firstLine = firstLine;
        this.secondLine = secondLine;
    }
    @Override
    public double getArea() {
        return firstLine * secondLine;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, color: " + getColor() + " , first line: "
                + firstLine + "second line: " + secondLine +
                " , area: " + getArea());
    }
}
