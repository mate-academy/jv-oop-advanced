package core.basesyntax;

public class RightTriangle<side> extends Figure {
    private int leg;

    public RightTriangle(String color,int side1) {
        super("right triangle", color);
        this.leg = side1;
    }

    public int getLeg(){
        return leg;
    }

    public void setLeg(int leg){
        this.leg = leg;
    }


    @Override
    public double getArea() {
        return ((leg * leg * Math.sqrt(3)) / 4);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()+
                ", area: " + getArea()+
                " sq.units , side length: " + getLeg()+
                " unuts, color: " + getColor());
    }
}
