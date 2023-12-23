#include <stdio.h>
#include <stdbool.h>

int main() {
    int maxArraySize = 100;
    int nums[maxArraySize];
    int size;


    printf("Enter the size of the array: ");
    scanf("%d", &size);


    printf("Enter the elements of the array:\n");
    for (int i = 0; i < size; i++) {
        scanf("%d", &nums[i]);
    }

    int maxReach = 0;


    for (int i = 0; i < size; i++) {

        if (i > maxReach) {
            printf("Result: false\n");
            return 0;
        }

     
        maxReach = (i + nums[i] > maxReach) ? i + nums[i] : maxReach;

     
        if (maxReach >= size - 1) {
            printf("Result: true\n");
            return 0;
        }
    }

   
    printf("Result: false\n");

    return 0;
}
