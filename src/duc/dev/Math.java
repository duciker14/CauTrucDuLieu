package duc.dev;
/**
 * Thuc hien cac cong viec voi mang nguyen 10 phan tu
 * @author Nguyen Quang Duc
 */

import java.util.Iterator;
import java.util.Scanner;

public class Math {
	/**
	 *
	 * @return: Array: Arr[10]
	 */
	public static int[] inputArr(){
		int Arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap du lieu cho mang: ");
		for (int i = 0; i < Arr.length; i++) {
			System.out.printf("A[%d] = ",i);
			Arr[i] = sc.nextInt();
		}
		return Arr;
	}
	/**
	 * 
	 * @param Arr[10]
	 * @return Print Arr[10]
	 */
	public static void ouputArr(int Arr[]) {
		System.out.println("Cac gia tri cua Mang la: ");
		for (int i : Arr) {
			System.out.printf("%d\t ",i);
		}
	}
	/**
	 * @param Arr[10]
	 * @return even number Arr
	 */
	public static int evenNumber(int Arr[]) {
		int prev = 0;
		for (int i : Arr) {
			if (i%2 == 0) {
				prev++;
			}
		}
		return prev;
	}
	/**
	 * @param Array Arr[10]
	 * @return Print value %2==0 && %3!=0
	 */
	public static void printValue(int Arr[]) {
		System.out.println("Cac gia tri chia het cho 2 nhung ko chia het cho 3 la:\n");
		for (int i : Arr) {
			if ((i%2 == 0) && (i%3 != 0)) {
				System.out.printf("%d\t",i);
			}
		}
	}
	/**
	 * @param x
	 * @return x True or False in Array 
	 */
	public static boolean checkX(int x, int Arr[]) {
		for (int i : Arr) {
			if(x == i) 
				return true;
		}
		return false;
	}
	/**
	 * @param Array Arr[10]
	 * @return checkArr Ascending?True or False
	 */
	public static boolean checkAsc(int Arr[]) {
		boolean check = true;
		for (int i = 0; i < Arr.length-1; i++) {
			if (Arr[i] < Arr[i+1] == false) {
				check = false;
			}
		}
		return check;
	}
}
