package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        int r= 10;

        Calculator calc = new Calculator();
        System.out.println("원의 면적: "+ calc.areaCircle(r));
        Computer computer = new Computer();
        System.out.println("원의 면적: " + computer.areaCircle(r));
    }
}
