import java.util.*;
public class Massive {
    int [] a;
    Massive(int n){
        a=new int[n];
        Random r= new Random();
        for(int i =0; i<a.length; i++)
            a[i]=r.nextInt(50);
    }
    Massive(int []a){
        this.a=a;
    }
    void print(){
        System.out.print("Массив");
        for(int i =0; i<a.length; i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
    int sum(){
        int s=0;
        for(int i =0; i<a.length; i++)
            s+=a[i];
        return s;
    }
}


