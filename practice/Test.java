package practice;

public class Test {
    public static void main(String[] args) {
        int num = 1323444484;
        int ans = sum(num);
        while (ans > 9) {
            ans = sum(ans);
        }
        System.out.println(ans);
    }

    public static int sum(int num) {
        int ans = 0;
        while (num > 0) {
            int temp = num % 10;
            ans += temp;
            num = num / 10;
        }
        return ans;
    }
}
