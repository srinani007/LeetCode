package AAATest1;

public class highestnum {
   public static void main(String[] args) {
    int[] numbers = { 12, 45, 7, 23, 56, 89, 34 , 4};
    highestnum obj = new highestnum();
    int result = obj.secondHighest(numbers);
    System.out.println("The second highest number is: " + result);
   }
   public int secondHighest (int[] nums) {
    int highest = Integer.MIN_VALUE, secondHighest = Integer.MIN_VALUE;
    for (int num : nums) {
        if (num > highest) {
            secondHighest = highest;
            highest = num;
        } else if (num > secondHighest && num != highest) {
            secondHighest = num;
        }
    }
    return secondHighest;
   } 
}
