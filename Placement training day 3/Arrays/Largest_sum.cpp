#include <stdio.h>

int main() {
    int maxSize = 100;
    
    int nums[maxSize];
    int size;

   
    printf("Enter the size of the array: ");
    scanf("%d", &size);

 
    printf("Enter the elements of the array:\n");
    for (int i = 0; i < size; i++) {
        scanf("%d", &nums[i]);
    }


    int maxSum = nums[0];
    int cursum = nums[0];


    for (int i = 1; i < size; i++) {
      
        cursum = (cursum + nums[i] > nums[i]) ? cursum + nums[i] : nums[i];

      
        maxSum = (cursum > maxSum) ? cursum : maxSum;
    }


    printf("Result: %d\n", maxSum);

    return 0;
}
