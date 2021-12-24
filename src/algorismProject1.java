import java.util.Scanner;

public class algorismProject1 {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];

		do {
			while (a[pl] < x)
				pl++;
			while (a[pr] > x)
				pr--;
			if (pl <= pr)
				swap(a, pl++, pr--);
		} while (pl <= pr);

		if (left < pr)
			quickSort(a, left, pr);
		if (pl < right)
			quickSort(a, pl, right);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("학생 수 입력：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("학생" + (i + 1) + " 점수 입력：");
			x[i] = stdIn.nextInt();
		}

		quickSort(x, 0, nx - 1);
		System.out.println("성적순으로 정렬");
		int j = 1;
		for (int i = nx - 1; i > -1; i--)
			System.out.println(j++ + "등  :  " + x[i]);
	}
}
