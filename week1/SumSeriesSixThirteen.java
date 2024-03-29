package java_bits.week1;

public class SumSeriesSixThirteen {

    public static void main(String[] args) {
        generateTable(20);
    }

    public static double m(int n){
        double result = 0;
        for (int i = 1; i <= n; i++){
            result += (double)i / (i + 1);
        }
        return result;
    }

    public static void generateTable(int n){
        System.out.println("i   m(i)");
        System.out.println("--------");
        for(int i = 1; i <= n; i++){
            System.out.println(i + "\t" + String.format("%.4f", m(i)));
        }
    }
}
