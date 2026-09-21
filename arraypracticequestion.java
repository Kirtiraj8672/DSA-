import java.util.*;

public class arraypracticequestion {
    //q1
    public static boolean containDuplicate(int num[]){
        for(int i =0 ; i<num.length ; i++){
            for(int j = i + 1  ; j< num.length; j++ ){
                if( num[i] == num[j]){
                    return true ;
                }
            }
            
        }
        return false ;
    }
    //q2
 public static int rotatedSearch(int[] nums, int target) {

    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {

        int mid = start + (end - start) / 2;

        // Target found
        if (nums[mid] == target) {
            return mid;
        }

        // Left half 
        if (nums[start] <= nums[mid]) {
            if (target >= nums[start] && target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        
        else {

            // right half
            if (target > nums[mid] && target <= nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
    }

    return -1;
}

    //q3
    public  static int maxProfit(int[] prices){
       int buy = prices[0];
       int profit = 0;

       for(int i =1 ; i<prices.length; i++){
        if(buy < prices[i]) {
            profit = Math.max(prices[i] - buy , profit);
        }
        else{
            buy = prices[i];
        }
       }
       return profit;
    }

    //q4 
    public static int water(int[] height){
        int n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        int waterlevel= 0 ;

        //to get left max array
        leftMax[0] = height[0];
        for(int i = 1 ; i<n ; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        //to get right max array

        rightMax[n-1] = height[n-1];
        for(int i = n -2 ; i>=0 ;i-- ){
            rightMax[i]= Math.max(rightMax[i+1],height[i]);
        }

        for(int i = 0 ; i< n ;i++){
            waterlevel=  waterlevel + Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return waterlevel;



    }

    //q5
    


     public static List<List<Integer>> threeSum(int[] nums1) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums1);

        for (int i = 0; i < nums1.length - 2; i++) {

            // Skip duplicate first element
            if (i > 0 && nums1[i] == nums1[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums1.length - 1;

            while (left < right) {

                int sum = nums1[i] + nums1[left] + nums1[right];

                if (sum == 0) {

                    result.add(Arrays.asList(nums1[i], nums1[left], nums1[right]));

                    // Skip duplicate left values
                    while (left < right && nums1[left] == nums1[left + 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right && nums1[right] == nums1[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }




        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //q1
        int num[] = {1,2,3,1};
        System.out.println(containDuplicate(num));

        int num2[] = {1,2,3,4};
        System.out.println(containDuplicate(num2));

        int num3[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containDuplicate(num3));
        

        //q2
       

        int nums[] = {4,5,6,7,0,1,2};
        System.out.println("num is");
        System.out.println(rotatedSearch(nums, 0));
        System.out.println(rotatedSearch(nums, 3)); 
        System.out.println(rotatedSearch(nums, 6)); 
        System.out.println(rotatedSearch(nums, 7)); 




        //q3
        int price[] ={7,1,5,3,6,4};
        System.out.println("QUESTION 3 ");
        System.out.println(maxProfit(price));


        //q4 
        int height [] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(water(height));

        //q5 
        
       System.out.println("QUESTION 5 ");
        int nums1[] = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> ans = threeSum(nums1);

        System.out.println(ans);
    }
    
}
