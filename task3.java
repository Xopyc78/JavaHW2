// 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
// Пример:
// Массив = {1, 22, 33, 44, 5, -5, -3, 23, -7}
// Сумма индексов двузначных элементов массива = 1+2+3+7 = 13
// Массив после замены отрицательных на сумму = {1, 22, 33, 44, 5, 13, 13, 23, 13}
import java.util.Arrays;
public class task3 {
     public static void main(String[] args){
        int[] numberArray={1, 22, 33, 44, 5, -5, -3, 23, -7};
        System.out.println(Arrays.toString(numberArray));
        int temp=0;
        int twoDigitInd=0;
        int sum=0;
        for (int i = 0; i < numberArray.length; i++) {
            temp=numberArray[i]/10;
            if (1<=temp && temp<10) {
                twoDigitInd=i;
            }
            else{
                twoDigitInd=0;
            }
        sum=sum+twoDigitInd;
        }
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i]<0) {
                numberArray[i]=sum;
            }
        }
        System.out.println(Arrays.toString(numberArray));
     }
    
}
