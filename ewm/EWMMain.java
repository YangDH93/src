package ewm;

import java.util.Scanner;

import bangMenu.Bang;
import doneMenu.DoneM;
import yangMenu.Yang;

public class EWMMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Menu m = null;

		while(true) {
			System.out.print("오늘 뭐 먹지?\n1.say 양동훈\n2.say 방지훈"
					+ "\n3.say 최지원\n4.say 예린홍\n5.뽑기 시작\n>>> ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: { // 오늘 뭐 먹 양동훈
				m = new Yang();
				m.menu();
			}break; 
			case 2: { // 오늘 뭐 먹 방지훈
				m = new Bang();
				m.menu();
			}break;
			case 3: { // 오늘 뭐 먹 최지원
				m = new DoneM();
				m.menu();
			}break;
			case 4: { // 오늘 뭐 먹 예린홍

			}break;

			}
			if(choice == 5) break;

		}// while문 종료 
		int num = (int) (Math.random()*4+1);
		System.out.println(num + "번 당첨~!");
		sc.close();
	}
}