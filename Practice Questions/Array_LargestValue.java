public class Array_LargestValue {
    public static int largestValue(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = { 11, 22, 33, 44, 55, 101, 66, 77, 88, 99 };
        int largest = largestValue(numbers);
        System.out.println("Largest Number " + largest);
    }
}