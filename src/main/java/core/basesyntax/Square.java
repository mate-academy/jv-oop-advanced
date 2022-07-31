package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String information() {
        return "figure: Square"+" side: "+side+" units area: "+area()+" sq.units" +" color: "+color;
    }

    @Override
    public double area() {
        return Math.pow(side,2);

    }
}
