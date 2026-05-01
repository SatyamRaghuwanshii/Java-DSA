import java.util.*;
public void main(){
    int val = 5;
    pattern1(val);//solid square
    pattern2(val);//hollow square
    pattern3(val);//solid right angled triangle
    pattern4(val);//reversed solid right angled triangle
    pattern5(val);//hollow right angled triangle
    pattern6(val);//reversed hollow right angled triangle
}
public void pattern1(int n){
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
}

public void pattern2(int n){

    for(int i = 0; i < n; i++){
        if(i == 0 || i == n-1){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
        }else{
            for(int j = 0; j < n; j++){
                if(j > 0 && j < n-1){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
        }
        System.out.println();
    }
    System.out.println();
}

public void pattern3(int n){
    for(int i = 0; i < n; i++){
        for(int j = 0; j <= i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
}

public void pattern4(int n){
    for(int i = n-1; i >= 0; i--){
        for(int j = 0; j <= i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
}

public void pattern5(int n){
    for(int i = 0; i < n; i++){
        if(i == n-1){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
        }else {
            for(int j = 0; j<=i+1; j++){
                if(j == 0 || j == i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
        }
        System.out.println();
    }
    System.out.println();
}

public void pattern6(int n){
    for(int i = n; i > 0; i--){
        if(i == n){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
        }else {
            for(int j = 0; j<=i; j++){
                if(j == 0 || j == i-1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
        }
        System.out.println();
    }
    System.out.println();
}