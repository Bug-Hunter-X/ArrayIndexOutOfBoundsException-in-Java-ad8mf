public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (arr.length > 0) { // Check to ensure the array isn't empty before accessing its elements
            arr[4] = 10; //Access a valid index
            System.out.println(arr[4]);
        } else{
            System.out.println("Array is Empty");
        }
    }
}