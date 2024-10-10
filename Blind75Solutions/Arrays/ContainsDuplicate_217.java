import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate_217 {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> countNumMap = new HashMap<>();
        for (int num : nums) {
            if (countNumMap.containsKey(num)) {
                // int count = countNumMap.get(nums[i]); // no need to check the count here. if it is present in map so it is 2 or more than 2 times.
                // count++;
                // if(count>=2)
                return true;
                // else return false;
            } else {
                countNumMap.put(num, 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Hello and welcome to Contains Duplicate Problem!");
        boolean res = containsDuplicate(new int[]{2,7,11,15,2});
        System.out.println("Does the array contains duplicate?: "+ res);
    }
}
