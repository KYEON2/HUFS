import java.io.*;
import java.util.*;

class Account {
    private String name = "Gil-dong";
    private int account_num = 0;
    private int balance = 0;

    public Account(String name, int account_num, int balance){
        this.name = name; this.account_num = account_num, this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public int getAccNo(){
        return account_num;
    }

    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance){
        this.balance += balance;
    }
    
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Account [] account = new Account[5];
        int count = 0;
        String command = null;

        while (true){
            command = scanner.next();
            if (command.equals("new") && (count <= 5)){
                String name = scanner.next();
                int account_num = scanner.nextInt();
                int balance = scanner.nextInt();
                account[count] = new Account(name, account_num, balance);
                count += 1;
            }
            else if (command.equals("deposit")){
                int idx = scanner.nextInt();
                int balance =scanner.nextInt();
                account[idx].setBalance(balance);
            }
            else if (command.equals("inquiry")){
                int idx = scanner.nextInt();
                System.out.printf("%s 님의 %d 계좌의 잔고는 %d원 남았습니다.\n", account[idx].getName(), account[idx].getAccNo(), account[idx].getBalance());
            }
            else if{
                command.equals("quit")
                break;
            }
        }
    }
}