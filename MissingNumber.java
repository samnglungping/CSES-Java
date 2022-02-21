import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n, m = 0;
        ArrayList<Integer> a=new ArrayList<Integer>();
        n=s.nextInt();
        for (int i = 0; i < n-1; i++) {
            //a[i]=s.nextInt();
            a.add(s.nextInt());
        }
        for (int i = 1; i <= n; i++) {
            m+=i;
        }
        for (int i : a) {
            m = m-i;
        }
        System.out.print(m);
        s.close();
    }
}