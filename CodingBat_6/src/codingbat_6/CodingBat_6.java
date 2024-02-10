
package codingbat_6;    //Dizideki en büyük ve en küçük eleman dışındakilerin ortalamasını veren metot


import java.util.Arrays;
import java.util.Random;


public class CodingBat_6 {

public static int []nums(){
    Random rn = new Random();
    int nums[] = new int[rn.nextInt(10)+1];
    
    for(int i=0;i<nums.length;i++){
        nums[i] = rn.nextInt(100)+1; 
    }
     System.out.println(Arrays.toString(nums));
    return nums;
}

public static int centeredAverage(int []nums){
    int count = 0;
    int smallest,largest,average;
    largest = nums[0];
    smallest = nums[0];
    
    for(int i =0;i<nums.length;i++){
        if(largest<nums[i]){
            largest = nums[i];
        }
        if(smallest>nums[i]){
            smallest = nums[i];
        }
    }
    System.out.println(largest+" "+smallest);
    
    for(int i=0;i<nums.length;i++){
        count+= nums[i];
        
    }
     average = (count-(largest+smallest))/2;
     System.out.println("ortalama: "+average);
    return average;
}
    public static void main(String[] args) {
        centeredAverage(nums());
    }
    
}
