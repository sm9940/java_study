package ch11.sec06;

public class Account {
    private long balance ;//잔고

    public Account(){}

    public long getBalance() {
        return balance;
    }
    public void deposit(int money){
        balance+= money; //예금
    }
    public void withdraw (int money)throws InsufficientException{
        if(balance<money){
           throw new InsufficientException("잔고가 부족합니다 "+(money-balance)+"모자람");
        }
        balance -= money; //출금
    }
}
