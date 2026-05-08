import java.util.*;
public void main(){
    int val = 5;
    pattern1(val);//solid square
    pattern2(val);//hollow square
    pattern3(val);//solid right angled triangle
    pattern4(val);//reversed solid right angled triangle
    pattern11(val);// filped triangle
    pattern12(val);// isosceles triangle
    pattern13(val);// reverse isosceles triangle
    pattern16(val);// number isosceles triangle
    pattern17(val);// char isosceles triangle
    pattern9(val);// number triangle
    pattern10(val);// number triangle
    pattern15(val);// number triangle
    pattern5(val);//hollow right angled triangle
    pattern6(val);//reversed hollow right angled triangle
    pattern7(val);//left tilted rhombus
    pattern8(val);//right tilted rhombus
    pattern14(val);// diamond pattern
    pattern18(val);// hollow diamond
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

public void pattern7(int n){
    for(int i = 0; i < n; i++){
        for(int k = 0; k < i; k++){
            System.out.print("  ");
        }
        for(int j = 0; j < n; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
}

public void pattern8(int n){
    for(int i = n; i > 0; i--){
        for(int k = 0; k < i-1; k++){
            System.out.print("  ");
        }
        for(int j = 0; j < n; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
}

public void pattern9(int n){
    for(int i = 0; i < n; i++){
        for(int j = 0; j <= i; j++){
            System.out.print((i+1) + " ");
        }
        System.out.println();
    }
    System.out.println();
}

public void pattern10(int n){
    for(int i = 0; i < n; i++){
        for(int j = 0; j <= i; j++){
            System.out.print((j+1) + " ");
        }
        System.out.println();
    }
    System.out.println();
}

public void pattern11(int n){
    for(int i = 1; i <= n; i++){
        for(int k = 0; k < n-i; k++){
            System.out.print("  ");
        }
        for(int j = 0; j < i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
}

public void pattern12(int n){
    for(int i = 1; i <= n; i++){
        for(int k = 0; k < n-i; k++){
            System.out.print("  ");
        }
        for(int j = 0; j < i; j++){
            System.out.print("* ");
        }
        for(int l = 1; l < i; l++){
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
}

public void pattern13(int n){
    for (int i = 0; i < n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print("  ");
        }
        for (int k = 0; k < n-i; k++){
            System.out.print("* ");
        }
        for (int k = 1; k < n-i; k++){
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
}

public void pattern14(int n){
    for(int i = n - ((n/2)-1); i < n; i++){
        for(int k = 0; k < (n-i); k++){
            System.out.print("  ");
        }
        for(int j = 0; j < i; j++){
            System.out.print("* ");
        }
        for(int j = 0; j < i-1; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    pattern13(n);
}

public void pattern15(int n){
    int k = 1;
    for(int i = 0; i < n; i++){
        for(int j = 0; j <= i; j++){
            System.out.print((k) + " ");
            k++;
        }
        System.out.println();
    }
    System.out.println();
}

public void pattern16(int n){
    int s = 1;
    for(int i = 0; i < n; i++){
        for(int k = 1; k < n-i; k++){
            System.out.print("  ");
        }
        for(int j = 0; j < i*2+1; j++){
            System.out.print(s + " ");
            s++;
        }
        System.out.println();
    }
    System.out.println();
}

public void pattern17(int n){
    int s = 65;
    for(int i = 0; i < n; i++){
        for(int k = 1; k < n-i; k++){
            System.out.print("  ");
        }
        for(int j = 0; j < i*2+1; j++){
            System.out.print((char) s + " ");
            s++;
        }
        System.out.println();
    }
    System.out.println();
}

public void pattern18(int n){
    for (int i = n - ((n/2)-2); i<n+1; i++){
        for (int k = 0; k <= (n-i); k++){
            System.out.print("  ");
        }
        for (int j = 0; j <= i+1; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    for (int i = 0; i<n; i++){
        for (int j = 0; j<i; j++){
            System.out.print("  ");
        }
        for (int j = 2*(n-i); j>1; j--){
            if (j == 2*(n-i) || j==2){
                System.out.print("* ");
            }else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println();
}