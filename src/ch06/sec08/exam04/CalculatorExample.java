package ch06.sec08.exam04;
public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        //정사각형의 너비
        double result1 = myCalc.areaRectangle(10);

        //직사각형의 너비
        double result2 = myCalc.areaRectangle(10, 20);
        System.out.println("정사각형의 너비: "+result1);
        System.out.println("직사각형의 너비: "+result2);
    }



    }

