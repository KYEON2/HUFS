import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		
		
		FileReader a = null;
		int n;
		
		try {
			a = new FileReader("data/lab10.txt");
			while((n=a.read()) != -1){
				n = Character.toUpperCase(n);
				System.out.print((char)n);
			}
			a.close();
			
		}catch(IOException e){
			System.out.println("입출력 오류");
		}
	}
}

/*
data/lab10.txt 파일
Hello. This is object-oriented programming.
You're working on the Week 10 lab.
This problem is about buffered input and output streams.
*/