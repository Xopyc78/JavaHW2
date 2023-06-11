// 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
public class task1 {
    public static void main(String[] args) {
        int N=0;
        int temp=0;
        int sum=0;
        int usual=0;
    /*Последовательность целых чисел от 1 до 1000 включительно */
    for (int i = 1; i < 1000; i++) {
        N=i;
        for (int j = 2; j <= N/2+1; j++) {
            temp=N%j;
            if (temp!=0|N==2) {
                usual=N;
            }
            else{
                
                usual=0;
                break;
            }
        }
    sum=sum+usual; 
    }
    System.out.println(sum);
    }
}