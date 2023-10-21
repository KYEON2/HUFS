import java.io.*;
import java.util.*;

class Account {
	private String name = "Gil-dong";
	private int account_num = 0;
	private int balance = 0;
	public Account() {
		name ="서연"; account_num = 1122; balance = 2000; 
	}

	public Account(String name, int account_num, int balance){
		this.name = name; this.account_num = account_num; this.balance = balance;
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
	public void setBalance(int a){
		this.balance += a;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account [] a= new Account[5];
		String command = null;
		int count = 0;
		
		for (int i = 0; i<a.length; i++){
			a[i] = new Account();
		}
		
		while(true){
			command = scanner.next();
			if(command.equals("new")){
				String name = scanner.next();
				int account_num = scanner.nextInt();
				int balance = scanner.nextInt();
				
				a[count] = new Account(name, account_num, balance);
				count += 1;
				if (count == 6 )break;
			} else if ( command.equals("deposit")){
				int d_num = scanner.nextInt();
				int d_balance = scanner.nextInt();
				
				a[d_num].setBalance(d_balance);
			} else if ( command.equals("inquiry")){
				int i_num = scanner.nextInt();
				
				System.out.printf("%s 님의 %d 계좌의 잔고는 %d원 남았습니다.\n",a[i_num].getName(), a[i_num].getAccNo(), a[i_num].getBalance());
				
			} else if ( command.equals("quit")){
				break;
			}
		}
		
		
	}
}
