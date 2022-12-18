package zadanie7.n4;

public class MathFunc implements MathCalculable {

    @Override
    public double pow(double a, int b) {
        double temp = 1;
        if (b == 0) return 1;
        else if (b > 0) {
            for (int i = 1; i <= b; i++) {
                temp *= a;
            }
            return temp;
        } else {
            for (int i = 1; i <= b * (-1); i++) {
                temp *= a;
            }
            return (double) 1 / temp;
        }
    }

    @Override
    public double complexAbsolute(ComplexNumber a) {
        return Math.sqrt(a.getReal()*a.getReal() + a.getImg()*a.getImg());
    }

    public double lengthOfCircle(double rad) {
        return 2*PI*rad;
    }


    public static void main(String[] args) {
        MathFunc foo = new MathFunc();
        System.out.println("Модуль числа 2 + 4i = " + foo.complexAbsolute(new ComplexNumber(2,4)));
        System.out.println("9^3 = " + foo.pow(9,3));
        System.out.println("Длина окружности с радиусом 5 = " + foo.lengthOfCircle(5));
    }
}
