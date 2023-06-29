import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take array input from the user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Take search/sort option from the user
        System.out.println("Select an option:");
        System.out.println("Press 1 to search or 2 sort the elements");
        int option1 = scanner.nextInt();

        if (option1 == 1) {
            System.out.println("Which Searching algorithm will you like to use");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");


            int InputOption = scanner.nextInt();

            switch (InputOption) {
                case 1:
                    System.out.print("Enter the element you want to find: ");
                    int linearSearchTarget = scanner.nextInt();

                    long startTime = System.currentTimeMillis();
                    int linearSearchIndex = Searching.linearSearch(arr, linearSearchTarget);
                    long endTime = System.currentTimeMillis();
                    long elapsedTime = endTime - startTime;

                    if (linearSearchIndex != -1) {
                        System.out.println("Element found at index: " + linearSearchIndex);
                    } else {
                        System.out.println("Element not found.");
                    }
                    System.out.println("Linear search time taken: " + elapsedTime + "ms");
                    break;

                case 2:
                    System.out.print("Enter the element you want to find: ");
                    int binarySearchTarget = scanner.nextInt();

                    // Sort the array before performing binary search
                    Sorting.mergeSort(arr);

                    startTime = System.currentTimeMillis();
                    int binarySearchIndex = Searching.binarySearch(arr, binarySearchTarget);
                    endTime = System.currentTimeMillis();
                    elapsedTime = endTime - startTime;

                    if (binarySearchIndex != -1) {
                        System.out.println("Element found at index: " + binarySearchIndex);
                    } else {
                        System.out.println("Element not found.");
                    }
                    System.out.println("Binary search time taken: " + elapsedTime + "ms");
                    break;

                default:
                    System.out.println("Invalid InputOption selected.");
            }
        }
            else if (option1==2) {
            System.out.println("Which Sorting algorithm will you like to use");
            System.out.println("1. Merge Sort");
            System.out.println("2. Bubble Sort");


            int InputOption2 = scanner.nextInt();
            switch (InputOption2) {
                case 1:
                    long startTime = System.currentTimeMillis();
                    Sorting.mergeSort(arr);
                    long endTime = System.currentTimeMillis();
                    long elapsedTime = endTime - startTime;

                    System.out.println("Array after merge sort: " + Arrays.toString(arr));
                    System.out.println("Merge sort time taken: " + elapsedTime + "ms");
                    break;

                case 2:
                    startTime = System.currentTimeMillis();
                    Sorting.bubbleSort(arr);
                    endTime = System.currentTimeMillis();
                    elapsedTime = endTime - startTime;

                    System.out.println("Array after bubble sort: " + Arrays.toString(arr));
                    System.out.println("Bubble sort time taken: " + elapsedTime + "ms");
                    break;

                default:
                    System.out.println("Invalid InputOption selected.");
            }
        }
        else{
                    System.out.println("Please input a valid  response");
                }


            }


        }

