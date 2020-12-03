package core.basesyntax;

import java.util.Random;

public class FiguresFactory {
    public Figure getFigure(int i) {
        switch (i) {
            case 0:
                return new Square(randomParameter(), new ColorProducer().get());
            case 1:
                return new Rectangle(randomParameter(),
                                     randomParameter(),
                                     new ColorProducer().get());
            case 2:
                return new RightTriangle(randomParameter(),
                                         randomParameter(),
                                         new ColorProducer().get());
            case 3:
                return new Circle(randomParameter(), new ColorProducer().get());
            case 4:
            default:
                return createTrapzoid();
        }
    }

    private int randomParameter() {
        return (new Random().nextInt(50) + 1); // 1 <= randomParameter <= 50
    }

    /* этот метод создает выпуклую равнобедренную  трапецию. Четырехугольник существует,
    когда наибольшая его сторона меньше суммы трех остальных. За эту проверку отвечает
    метод isIsoscelesTrapezoidExists, метод createTrapzoid создает три случайных числа:
    а и b - основания трапеции, а с - боковые стороны. Если  метод isIsoscelesTrapezoidExists
    возвращает false, то метод createTrapzoid вызывает себя, создает новый набор значений
    для сторон, до тех пор, пока не создаст набор значений, с которыми isIsoscelesTrapezoidExists
    вернет true, тогда метод createTrapzoid создаст трапецию*/
    private IsoscelesTrapezoid createTrapzoid() {
        double a = randomParameter();
        double b = randomParameter();
        double c = randomParameter();
        if (isIsoscelesTrapezoidExists(a, b, c)) {
            return new IsoscelesTrapezoid(a, b, c, new ColorProducer().get());
        } else {
            createTrapzoid();
        }
        return null;
    }

    private boolean isIsoscelesTrapezoidExists(double a, double b, double c) {
        if (a < b + c + c) {
            return true;
        } else {
            return b < a + c + c;
        }
    }
}
