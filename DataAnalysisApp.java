import java.util.Scanner;

class DataAnalysisApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // ---------- 1. Single Dimensional Array ----------
            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            // Storing values
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter value " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            // ---------- 2. Sum, Average, Max, Min ----------
            int sum = 0;
            int max = arr[0];
            int min = arr[0];

            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];

                if (arr[i] > max)
                    max = arr[i];

                if (arr[i] < min)
                    min = arr[i];
            }

            double average = (double) sum / arr.length;

            // ---------- 3. Manual Sorting (Bubble Sort) ----------
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            // ---------- 4. Multi Dimensional Array ----------
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
            };

            // ---------- 7. Formatted Output ----------
            System.out.println("\n--- Data Analysis Result ---");
            System.out.println("Sum     : " + sum);
            System.out.println("Average : " + average);
            System.out.println("Max     : " + max);
            System.out.println("Min     : " + min);

            System.out.print("Sorted Array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println("\n\n2D Array Elements:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

        }
        // ---------- 5. Exception Handling ----------
        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Array index error occurred!");
        }
        catch (Exception e) {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}

