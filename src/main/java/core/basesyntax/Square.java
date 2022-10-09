package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        setFigureName("square");
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getFigureArea() {
        return side * side;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: " + getFigureName()
                + ", area: " + getFigureArea()
                + " sq. units, side: " + getSide()
                + " unit(s), color: " + getFigureColor());
    }
}
