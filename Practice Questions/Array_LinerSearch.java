
public class Array_LinerSearch {

    public static int Array_linerSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
        int key = 44;

        int index = Array_linerSearch(numbers, key);
        if (index== -1){
            System.out.println("Not Found");
        }else{
            System.out.println ("Found at index " + index);
        }
    }
}
