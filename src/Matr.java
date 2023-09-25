import java.util.*;
public class Matr {
    int [][] a;
    Matr(int n, int n1){
        a= new int[n][n1];
        Random  r= new Random();
        for(int i=0; i<a.length; i++)
            for(int j=0; j<a[i].length; j++)
                a[i][j]=r.nextInt(4,7);


    }
    void print(){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++)
                System.out.print(a[i][j]+" ");
            System.out.println();}
    }
    int sumprost(){
        int sum=0;
        for(int i=0; i<a.length; i++)
            for(int j=0; j<a[i].length; j++)
                if(i<j &&Funk.prost(a[i][j])) sum+=a[i][j];
        return sum;
    }
    void zamchet() {
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++)
                if (Funk.uniq(a[i][j])) sum++;
            if (sum > 2) {
                for (int j = 0; j < a[i].length; j++)
                    if (a[i][j] % 2 == 0) a[i][j] = 0;
            }
        }
    }

}
