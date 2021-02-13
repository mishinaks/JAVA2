public class Myarrays {
    public static void main(String[] args){
        int[] nums = {3, 2, 4,  4, 5};
        int a = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = a;
        System.out.println(nums[0]+nums[(nums.length - 1)/2]);
    }
}
