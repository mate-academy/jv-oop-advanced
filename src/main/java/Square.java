public class Square extends Figure {

    private int side;

    public Square(String color, String figureType, int side) {
        super(color,figureType);
        this.side = side;
    }

    public int getSide() {

        return side;
    }

    public void setSide() {

        this.side = side;
    }

    @Override
    public double getArea() {

        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getFigureType() + ", " + " area: "
                + Math.round(getArea() * 100.0) / 100.0 + " sq.units, "
                + " side: " + side + " units, "
                + " color: " + getColor());
    }

}
