import java.util.HashMap;
import java.util.Map;
public class TwoSum_1 {
     public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> pairInx = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            if(pairInx.containsKey(target-nums[i])){
                return new int[]{i, pairInx.get(target-nums[i])};
            }
            pairInx.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        System.out.print("Hello and welcome for Two Sum!");
        int target = 9;
        int[] res = twoSum(new int[]{2,7,11,15},target);
        System.out.print("The two sum is: ");
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}