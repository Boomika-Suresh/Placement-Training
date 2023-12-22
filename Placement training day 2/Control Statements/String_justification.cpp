#include <stdio.h>
#include <string.h>

void justifySentence(char input[], int screenLen) 
{
    int inputLen = strlen(input);
    int spaceCount = 0;

    for (int i = 0; i < inputLen; i++) 
	{
        if (input[i] == ' ') 
		{
            spaceCount++;
        }
    }

    int totalSpaces = screenLen - inputLen + spaceCount;
    int extraSpaces = totalSpaces % spaceCount;
    int Gap = totalSpaces / spaceCount;

    int index = 0;
    while (index < inputLen)
	 {
        if (input[index] == ' ') 
		{
            int spacesToAdd = Gap;
            if (extraSpaces > 0)
		 {
                spacesToAdd++;
                extraSpaces--;
            }
            int innerIndex = 0;
            while (innerIndex < spacesToAdd) {
                printf("*");
                innerIndex++;
            }
        } else {
            printf("%c", input[index]);
        }
        index++;
    }
}

int main() {
    char text[100];
    int length;

    printf("Enter the sentence: ");
    fgets(text, sizeof(text), stdin);
    text[strcspn(text, "\n")] = '\0';

    printf("Enter the screen length: ");
    scanf("%d", &length);

    printf("Sample Output:\n");
    justifySentence(text, length);
    printf("\n");

    return 0;
}
