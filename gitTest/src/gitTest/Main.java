package gitTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	static boolean flag = true;

	public static void main(String[] args) throws InterruptedException {
		
		Thread th = new Thread(() -> {
			Scanner sc = new Scanner(System.in);
			sc.nextLine();
			flag = false;
			System.out.println("\n\t[종료]\n");
			sc.close();
		});
		th.start();
		
		while(flag) {
			SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
			String start = sdf.format(new Date());
			System.out.println(start);
			Thread.sleep(1000);
		}
		
	}

}
