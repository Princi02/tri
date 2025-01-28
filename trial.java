import java.util.*;
public class trial{
	public static void main(String args[]){
		 int arr[] = {1,2,3,4,5,6,7,9,9};
		 Arrays.sort(arr);
		 for(int i=0; i<arr.length; i++){
 			if(arr[i]!=i+1){
				System.out.println("the number " + (i+1) + " is missing" );
			}
		}
	}
}
