#include <stdio.h>

int main() {
    int arr[10], op[10], n, count = 0;
    int *ptr = arr;
    printf("N = ");
    scanf("%d", &n);

    // Validate input array size
    if (n <= 0 || n > 10) {
        printf("Invalid array size. Please enter a size between 1 and 10.\n");
        return 1;  // Exit with an error code
    }

    printf("Enter the elements:");
    for (int i = 0; i < n; i++) {
        scanf("%d", &ptr[i]);
    }

    printf("a[] = {");
    for (int i = 0; i < n; i++) {
        printf("%d,", ptr[i]);
    }
    printf("\b}");

    // Count the occurrences
    int found = 0;  // Flag to check if any elements are found more than once
    for (int i = 0; i < n; i++) {
        count = 1;
        for (int j = i + 1; j < n; j++) {
            if (ptr[i] == ptr[j]) {
                count++;
            }
        }
        if (count > 1) {
            op[found++] = ptr[i];
        }
    }

    // Check if no elements are found
    if (found == 0) {
        printf("[-1]\n");
    } else {
        // Sort the op array (bubble sort for simplicity)
        for (int i = 0; i < found - 1; i++) {
            for (int j = 0; j < found - i - 1; j++) {
                if (op[j] > op[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = op[j];
                    op[j] = op[j + 1];
                    op[j + 1] = temp;
                }
            }
        }

        // Print the elements occurring more than once in ascending order
        printf("[");
        for (int i = 0; i < found - 1; i++) {
            printf("%d,", op[i]);
        }
        printf("%d]\n", op[found - 1]);
    }

    return 0;  // Exit successfully
}

