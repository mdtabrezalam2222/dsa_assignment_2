import java.util.Arrays;
public class ArrayRotation {
    public static void rotateArray(int[] arr, int rotationCount) {
        int length = arr.length;
        int[] temp = new int[length];
        rotationCount = rotationCount % length;  
        for (int i = 0; i < length; i++) {
            temp[(i + rotationCount) % length] = arr[i];
        }

        for (int i = 0; i < length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotationCount = 2;

        System.out.println("Original array: " +Arrays.toString(arr));
        rotateArray(arr, rotationCount);
        System.out.println("Rotated array: " +Arrays.toString(arr));
    }
}
