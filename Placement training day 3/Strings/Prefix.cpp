#include <stdio.h>
#include <string.h>

int main() {
    char strs[100][100], op[10];
    int n, i, j, k, len = 0;

    printf("Enter the number of elements: ");
    scanf("%d", &n);

    printf("Enter the strings: ");
    for (i = 0; i < n; i++) {
        scanf("%s", strs[i]);
    }

    printf("[");
    for (i = 0; i < n; i++) {
        printf("'%s',", strs[i]);
    }
    printf("\b]\n");

    // Find the length of the first string
    len = strlen(strs[0]);

    // Initialize the output array
    for (i = 0; i < len; i++) {
        op[i] = strs[0][i];
    }

    // Find the common prefix among the strings
    for (i = 1; i < n; i++) {
        for (j = 0; j < len; j++) {
            if (strs[i][j] != op[j]) {
                len = j;
                break;
            }
        }
    }

    // Print the common prefix
    printf("Common Prefix: ");
    for (i = 0; i < len; i++) {
        printf("%c", op[i]);
    }
    printf("\n");

    return 0;
}

