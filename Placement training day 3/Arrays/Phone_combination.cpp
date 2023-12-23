#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    char digits[100];

   
    printf("Enter the digits: ");
    scanf("%s", digits);

    int digitsLen = strlen(digits);
    char** comb = NULL;
    char current[100];

 
    char let[8][4] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    
    int comblen = 1;
    for (int i = 0; i < digitsLen; i++) {
        comblen *= strlen(let[digits[i] - '2']);
    }

    comb = (char*)malloc(comblen * sizeof(char));
    for (int i = 0; i < comblen; i++) {
        comb[i] = (char*)malloc((digitsLen + 1) * sizeof(char));
    }

    int index[digitsLen];
    for (int i = 0; i < digitsLen; i++) {
        index[i] = 0;
    }

    for (int i = 0; i < comblen; i++) {
        for (int j = 0; j < digitsLen; j++) {
            comb[i][j] = let[digits[j] - '2'][index[j]];
        }
        comb[i][digitsLen] = '\0';

     
        int carry = 1;
        for (int j = digitsLen - 1; j >= 0; j--) {
            index[j] += carry;
            carry = index[j] / strlen(let[digits[j] - '2']);
            index[j] %= strlen(let[digits[j] - '2']);
        }
    }

 
    printf("Output: [");
    for (int i = 0; i < comblen; i++) {
        printf("\"%s\"", comb[i]);
        if (i < comblen - 1) {
            printf(",");
        }
    }
    printf("]\n");

    // Free allocated memory
    for (int i = 0; i < comblen; i++) {
        free(comb[i]);
    }
    free(comb);

    return 0;
}
