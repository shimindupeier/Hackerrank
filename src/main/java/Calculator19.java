import java.util.*;

interface AdvancedArithmetic{
    int divisorSum(int n);
}
class Calculator19 implements AdvancedArithmetic {
    private ArrayList<Integer> divisorList = new ArrayList<Integer>();
    public int divisorSum(int n) {
        divisorList.add(1);
        divisorList.add(n);
        int f1 = 1;
        int f2 = n;
        while (f1 != f2 && f1 != f2-1) {
            f1 += 1;
            f2 = n/(f1);
            divisorList.add(f1);
            divisorList.add(f2);
        }
        divisorList.stream().mapToInt(Integer::intValue).sum();

        return 0;
    }
}

class Solution19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator19();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
