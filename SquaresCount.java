import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SquaresCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        int breadth = sc.nextInt();
        int area = length * breadth;
        List<Integer> ls = new ArrayList<>();
        for (int i = 1; i <= area; i++) {
            int a1 = i * i;
            if (a1 > area)
                continue;
            int remainder = area % a1;
            if (remainder != 0) {
                continue;
            } else {
                ls.add(area / a1);
            }
        }

        int[] minRes = new int[ls.size()];
        for (int i = 0; i < ls.size(); i++)
            minRes[i] = ls.get(i);
        int small = minRes[0];
        for (int i = 0; i < minRes.length - 1; i++) {

            if (minRes[i] < minRes[i + 1]) {
                small = minRes[i];
            } else {
                small = minRes[i + 1];
            }
        }
        System.out.println(small);

    }
}
