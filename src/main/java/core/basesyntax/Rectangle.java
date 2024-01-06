package core.basesyntax;

public class Rectangle extends Figure {
    private double fstSide;
    private double secondSide;

    public void setASide(double firstSide) {
        this.fstSide = firstSide;
    }

    public void setBSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        setFigureName("Rectangle");
        System.out.println("Figure: " + getFigureName());
        setFigureArea(fstSide * secondSide);
        System.out.println("area: " + getFigureArea() + " sq. units");
        System.out.println("a: " + fstSide + " units");
        System.out.println("b: " + secondSide + " units");
        System.out.println("color: " + getColor());
    }
}
