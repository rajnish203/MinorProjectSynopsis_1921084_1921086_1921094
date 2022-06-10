import java.util.*;
public class Stack4{ 
    private int top;
    private int capacity;
    private int []a;
    Stack4(int size){
        a=new int[size];
        capacity=size;
        top=-1;

    }
    void push(int x){
        if(isFull()){
            System.out.println("Stack is full ");
            System.exit(1);
        }
        System.out.println("Inserting "+x);
        a[++top]=x;
    }
    public static void main(String[] args){
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= r.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element in the array increasing or decreasing order");
        for(int i=0;i<arr.length;i++){
            arr[i]=r.nextInt();
        }
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                temp++;
                }   
            }
    
        }
        System.out.println("The value of temp is "+temp);
        int[] arr2=new int[temp];
        int temp2=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                arr2[temp2]=arr[i];
                temp2=temp2+1;
            }
            }
        }
        System.out.println("The element in the array after the duplicates removed");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }

    }
}