#include <stdio.h>

int main() {
    int degree;
    
    // Input the degree of the polynomial
    printf("Enter the degree of the polynomial: ");
    scanf("%d", &degree);

    // Input the coefficients
    int coefficients[degree + 1];
    printf("Enter the coefficients : ", degree);
    for (int i = degree; i >= 0; i--) {
        scanf("%d", &coefficients[i]);
    }

    // Input the value for x
    int x;
    printf("Enter the value of x: ");
    scanf("%d", &x);

    // Evaluate the polynomial
    int result = 0;
    for (int i = degree; i >= 0; i--) {
        result = result * x + coefficients[i];
    }

    // Output the result
    printf("P(%d) = %d\n", x, result);

    return 0;
}
