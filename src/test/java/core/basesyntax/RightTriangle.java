package core.basesyntax;

public class RightTriangle<side> extends Figure {
    private int side1;

    public RightTriangle(String color,int side1) {
        super("right triangle", color);
        this.side1 = side1;
    }

    public int getSide1(){
        return side1;
    }

    public void setSide1(int side1){
        this.side1 = side1;
    }


    @Override
    public double getArea() {
        return ((side1 * side1 * Math.sqrt(3)) / 4);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()+
                ", area: " + getArea()+
                " sq.units , side length: " + getSide1()+
                " unuts, color: " + getColor());
    }
}
