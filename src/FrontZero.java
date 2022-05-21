public class FrontZero {
    public static void main(String[] args) {
        int[] tabTest = {1 ,0,0,0,0,0,1,1,1,0,0,1,2,5,0,0,8};
        int[] tabTestResult = new int[tabTest.length];
        tabTestResult = zeroFront(tabTest);
        for (int i : tabTestResult){
            System.out.print(i +" ");
        }

    }

    public static int[] zeroFront(int[] nums) {
        int[] finalArray = new int[nums.length];
        int count = 0;
        int j = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                finalArray[count] = nums[i];
                count++;
            } else {
                finalArray[j] = nums[i];
                j--;

            }
        }
        return finalArray;
    }
}
