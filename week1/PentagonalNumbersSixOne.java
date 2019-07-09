package java_bits.week1;

public class PentagonalNumbersSixOne {

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            if (i % 10 == 0){
                System.out.println();
            }
            System.out.print(Integer.toString(getPentagonalNumber(i + 1)) + ' ');
        }
    }

    public static int getPentagonalNumber(int n){
        return n*(3*n - 1)/2;
    }
}
