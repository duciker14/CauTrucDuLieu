package duc.dev;

import java.util.Scanner;

/**
 * Thuc hien cac cong viec voi mang nguyen 10 phan tu
 * @author Nguyen Quang Duc
 *
 */
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khai bao
		int Arr[] = new int[10];
		
		//Nhap mang
		Arr = Math.inputArr();
		
		//Xuat Mang
		Math.ouputArr(Arr);
		
		//Dem so so chan
		int temp = Math.evenNumber(Arr);
		System.out.println("\nSo so chan trong mang la:\n " +temp);
		
		//In ra cac gia tri chia het cho 2 nhung k chia het cho 3
		Math.printValue(Arr);
		
		//Kiem tra x thuoc mang ko?
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap x = ");
		int x = sc.nextInt();
		if (Math.checkX(x, Arr) == true) {
			System.out.println("so x thuoc mang");
		}else {
			System.out.println("x k thuoc mang");
		}
		
		// Kiem tra mang co sx tang dan hay k
		if (Math.checkAsc(Arr) == true) {
			System.out.println("\nMang tang dan");
		}else {
			System.out.println("\nMang k tang dan");
		}
	}

}
