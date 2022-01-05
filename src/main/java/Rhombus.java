public class Rhombus extends Figure {
    private int diagonal1;
    private int diagonal2;

    public Rhombus(String color, String figureType, int diagonal1, int diagonal2) {
        super(color,figureType);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public int getDiagonal1() {

        return diagonal1;
    }

    public void setDiagonal1(int diagonal1) {

        this.diagonal1 = diagonal1;
    }

    public int getDiagonal2() {

        return diagonal2;
    }

    public void setDiagonal2(int diagonal2) {

        this.diagonal2 = diagonal2;
    }

    @Override
    public double getArea() {

        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getFigureType() + "," + " area: "
                + Math.round(getArea() * 100.0) / 100.0 + " sq.units, "
                + " diagonal1: " + diagonal1 + " units, "
                + " diagonal2: " + diagonal2 + " units, "
                + " color: " + getColor());
    }
}
