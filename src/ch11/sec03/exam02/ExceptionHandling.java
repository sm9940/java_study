package ch11.sec03.exam02;

public class ExceptionHandling {
    public static void main(String[] args) {
        String[] array ={"100", "1oo",null, "200"};
        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array["+i+"]: "+value);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스가 초과됨:"+e.getMessage());
            }
            catch (Exception e){
                //2가지 이상의 예외를 동일한 catch문에서 처리하고 싶을때
                System.out.println("데이터에 문제가 있음: "+ e.getMessage());
            } //상위 예외 클래스는 가장 아래 에 작성
        }
    }
}
