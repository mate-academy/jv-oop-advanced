package core.basesyntax;

import java.util.Random;


public class Main implements Fillable {

    public static void main(String[] args){
        Main main = new Main();
        Shape[] shapeArr = main.fill();

        for(Shape s : shapeArr){
            System.out.println(s.info());
        }
    }

    public Shape[] fill() {
        Random rand = new Random();
        Shape[] shapeArr = new Shape[generateRandomArrayLength()];
        Shape shape = null;
        for(int i = 0; i < shapeArr.length; i++){
            switch (rand.nextInt(4)){
                case 0:
                    shape = new Square("square");
                    break;
                case 1:
                    shape = new Rectangle("rectangle");
                    break;
                case 2:
                    shape = new Circle("circle");
                    break;
                case 3:
                    shape = new RightTriangle("right triangle");
                    break;
                case 4:
                    shape = new IsoscelesTrapezoid("trapezoid");
                    break;
            }
            shapeArr[i] = shape;
        }
        return shapeArr;
    }

    public static int generateRandomArrayLength() {
        int generator = (int)(20 + Math.random() * 60);
        return generator;
    }
}
