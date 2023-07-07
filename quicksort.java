
//quick sort algorithm
import java. util.*;
public class Main
{
    static int partition(int arr[],int s,int e){
        int pivot=arr[s];
        int c=0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<=pivot)c++;
        }
        int pivotindex=c+s;
        int temp=arr[pivotindex];
        arr[pivotindex]=arr[s];
        arr[s]=temp;
        int i=s;
        int j=e;
        while(i<pivotindex && j>pivotindex){
            while(arr[i]<arr[pivotindex])i++;
            while(arr[j]>arr[pivotindex])j--;
            if(i<pivotindex && j>pivotindex){
                int temp1=arr[i];
                arr[i]=arr[j];
                arr[j]=temp1;
                i++;
                j--;
            }
        }
        return pivotindex;
    }
    static void quickSort(int arr[],int s,int e){
        if(s>=e)return;
        int p=partition(arr,s,e);
        quickSort(arr,s,p-1);
        quickSort(arr,p+1,e);
    }
    
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	}
	quickSort(arr,0,n-1);
	System.out.println(Arrays.toString(arr));
	}
}

