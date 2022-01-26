//Record Breaker
import java.util.*;

public class RecordBreaker {
    Scanner obj = new Scanner(System.in);

    void getData(int a[], int n) {
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }
    }

    void record(int a[], int n) {
        int current = 0;
        int mx = -1;
        a[n] = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > mx && a[i] > a[i + 1]) {
                current++;
            }
            mx = Math.max(mx, a[i]);
        }
        System.out.println(current);
    }

    public static void main(String args[]) {
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        n = obj.nextInt();
        System.out.println("Enter the array elements :");
        int a[] = new int[n + 1];
        RecordBreaker obj1 = new RecordBreaker();
        obj1.getData(a, n);
        obj1.record(a, n);
    }
}