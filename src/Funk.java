import java.util.*;
public class Funk {
    static boolean prost(int x){
        for(int i=2; i<x; i++)
            if(x%i==0) return false;
         return true;
        }

    static boolean uniq(int x) {
        int s=0;
        for(int i=1; i < x; i++) s+=i;
        if(s==x) return true;
        return false;
    }
}


