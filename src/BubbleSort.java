import java.util.*;

public class BubbleSort {
	
	static void bubble(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }
	}
	//change

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n;
		n=x.nextInt();
		int arr[]=new int[n];
		for(int a=0;a<n;a++) {
			int k=x.nextInt();
			arr[a]=k;
		}
		//for(int a=0;a<n;a++) {
		//	System.out.println(arr[a]);
		//}
		bubble(arr);
		
		for(int i=0; i < arr.length; i++){  
            System.out.print(arr[i] + " ");  
    } 

		x.close();
	}

}
