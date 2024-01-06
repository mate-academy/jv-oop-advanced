package core.basesyntax;

public class Square extends Figure {
    private double side;

    public void setASide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        setFigureName("Square");
        System.out.println("Figure: " + getFigureName());
        setFigureArea(side * 2);
        System.out.println("area: " + getFigureArea() + " sq. units");
        System.out.println("a: " + side + " units");
        System.out.println("color: " + getColor());
    }
}
