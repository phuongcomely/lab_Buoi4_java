import java.util.Arrays;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số phần tử N: ");
        int n = Integer.parseInt(scanner.nextLine());


            int arr[] = new int[n];
            for (int i=0; i<n; i++){
                System.out.println("Giá trị của a["+i+"]: ");
                int value = Integer.parseInt(scanner.nextLine());
                arr[i] =value;


            }
        System.out.println("Mảng được khởi tạo là: " +Arrays.toString(arr));
            System.out.println("Chèn thêm một phần tử vào mảng");
            int arrNew[] = new int[n+1];
            for (int i=0; i<n; i++){
                arrNew[i]=arr[i];
            }
            System.out.println("Nhập vào phần tử cần chèn: ");
            arrNew[n]=Integer.parseInt(scanner.nextLine());
            System.out.println("Mảng đã được thêm phần tử là: " + Arrays.toString(arrNew));

             System.out.println("Đổi chỗ phần tử thứ 2 và thứ 3");
             int temp=arrNew[1];
            arrNew[1]=arrNew[2];
            arrNew[2] =temp;

            System.out.println("Mảng mới sau khi đổi chỗ: "+Arrays.toString(arrNew));

//        Sắp xếp mảng theo thứ tự tăng dần
        int arrange = arrNew[0];
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n+1; j++ ){
                if(arrNew[i]>arrNew[j]){
                    arrange = arrNew[j];
                    arrNew[j]=arrNew[i];
                    arrNew[i]=arrange;
                }
            }
        }
        System.out.println("Mảng đã được sắp xếp: " +Arrays.toString(arrNew));



    }
}
