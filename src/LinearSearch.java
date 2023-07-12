import java.util.Scanner;

public class LinearSearch {
    public static int Occurrence(int[] Array,int Number)
    {
        int Count=0;
        for(int i=0;i<Array.length;i++)
        {
            if(Array[i]==Number)
            {
                Count++;
            }
        }
        return Count;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size : ");
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int[] Array=new int[size];
        System.out.println("Enter the Elements : ");
        for(int i=0;i<size;i++)
        {
            Array[i]=scan.nextInt();
        }
        System.out.println("Enter the Number for Linear Search : ");
        int Number = scan.nextInt();
        System.out.println("Occurrence is : "+Occurrence(Array,Number));
    }
}
