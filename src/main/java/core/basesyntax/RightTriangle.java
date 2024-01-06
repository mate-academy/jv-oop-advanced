package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;

    public void setASide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        setFigureName("RightTriangle");
        System.out.println("Figure: " + getFigureName());
        setFigureArea(((side * side) * Math.sqrt(3)) / 4);
        System.out.println("area: " + getFigureArea() + " sq. units");
        System.out.println("a: " + side + " units");
        System.out.println("color: " + getColor());
    }
}
