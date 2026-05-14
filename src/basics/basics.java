import java.util.Scanner;
public void main(){
    Scanner sc = new Scanner(System.in);
    int[] Marks = new int[5];
    for (int i = 0; i < 5; i++) {
        System.out.println("enter marks of subject " + (i + 1) + ": ");
        Marks[i] = sc.nextInt();
    }
    int sum = 0;
    for (int i = 0; i < 5; i++) {
        sum += Marks[i];
    }
    System.out.println(sum);

    int min = Marks[0];
    for (int i = 0; i < 5; i++) {
        if(Marks[i]<min){
            min = Marks[i];
        }
    }
    int total = sum-min;
    System.out.println("Avg of top 4 is: " + (total/4) + "%" );
}