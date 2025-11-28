import java.util.*;
import java.lang.*;
import java.io.*;

class Problem4{
    public static void main (String[] args)
	{
		/* [1,2,3,4,5,6,7,8,9]
           (examples)
           input: [1,2,8,9,12,46,76,82,15,20,30]
           Output: {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}
        */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        HashMap<Integer, Integer> occ = new HashMap<>();
        for(int i=1; i<=9; i++){
            int cnt = 0;
            for(int num: arr){
                if(num%i==0){
                    cnt++;
                }
            }
            occ.put(i,cnt);
        }
        
        for(int key: occ.keySet()){
            System.out.print(key + ": " + occ.get(key) + ", ");
        }

	}
}