package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final static int MAX_VALUE_SIDE=100;
    private final static int WHICH_FIGURE=5;
    ColorSupplier colorSupplier =new ColorSupplier();
    String color=colorSupplier.getRandomColor();
    public Figure getRandomFigure(){
        double side=1+(Math.random()*MAX_VALUE_SIDE);
        double side2=1+(Math.random()*MAX_VALUE_SIDE);
        double side3=1+(Math.random()*MAX_VALUE_SIDE);
        int whichFigure=new Random().nextInt(WHICH_FIGURE);
        switch (whichFigure){
            case 1:
                return new IsoscelesTrapezoid(color,side,side2,side3);
            case 2:
                return new RightTriangle(color,side,side2);
            case 3:
                return  new Rectangle(color,side,side2);
            case 4:
                return new Square(color,side);
            default:
                return  new Circle(color, side);
        }
    }
    public Figure getDefaultFigure(){
       return new Circle("WHITE",10);
    }




}
