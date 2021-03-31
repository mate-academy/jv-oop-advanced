package core.basesyntax;

public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle (String color, int side1, int side2) {
        super("rectangle", color);
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getSide1(){
        return side1;
    }

    public int getSide2(){
        return side2;
    }
    public void setSide1(int side1){
        this.side1 = side1;
    }

    public void setSide2(int side2){
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return this.side1 * this.side2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() +
                ", area: " + getArea() +
                " sq. units, side1 length: "+ getSide1()+
                " sq. units, side2 length: "+ getSide2() +
                " units, color: " + getColor());
    }
}
