public class ArrayCopyExample {
    public static void main(String[] args) {
        // Source array
        int[] sourceArray = {1, 2, 3, 4, 5};

        // Destination array
        int[] destinationArray = new int[sourceArray.length];

        // Copying elements from source array to destination array
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }

        // Printing the elements of the destination array
        System.out.println("Elements of the destination array:");
        for (int i = 0; i < destinationArray.length; i++) {
            System.out.print(destinationArray[i] + " ");
        }
    }
}

