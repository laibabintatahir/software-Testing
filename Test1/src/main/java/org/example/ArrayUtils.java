package org.example;

public class ArrayUtils {

    public static int find(int[] arr,int x){
        if(arr==null || arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
