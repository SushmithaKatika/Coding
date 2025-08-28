public class ReverseNumber {
    public int reverseNumber(int n) {
        int reversedN = 0;
        while (n > 0) {
            int rem = n % 10;
            reversedN = reversedN * 10 + rem;
            n = n / 10;

        }
        return reversedN;
    }
    public static void main(String args[]){
        ReverseNumber rn = new ReverseNumber();
        System.out.println(rn.reverseNumber(11239));
    }
}
