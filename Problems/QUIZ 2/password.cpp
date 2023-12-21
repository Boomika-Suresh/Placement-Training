#include <stdio.h>
#include <string.h>
#include <stdbool.h>
int main()
{
    char pass[100];
    printf("Enter a password to check:");
    scanf("%s", &pass);
    char spl[] = "!@#$%^&*()-+";
    int len = strlen(pass);
    bool small_bool = false;
    bool caps_bool = false;
    bool spl_bool = false;
    bool num_bool = false;
    if (len < 8)
    {
        printf("Password is too small");
        return 0;
    }
    bool special_check(char ch)
    {
        for (int j = 0; j < strlen(spl); j++)
        {
            if (ch == spl[j])
            {
                return true;
            }
        }
        return false;
    }
    for (int i = 0; i < len; i++)
    {
        if (pass[i] >= 'a' && pass[i] <= 'z')
        {
            small_bool = true;
        }
        else if (pass[i] >= 'A' && pass[i] <= 'Z')
        {
            caps_bool = true;
        }
        else if (pass[i] >= '0' && pass[i] <= '9')
        {
            num_bool = true;
        }
        else if (special_check(pass[i]))
        {
            spl_bool = true;
        }
    }
    if (small_bool && caps_bool && num_bool && spl_bool)
    {
        printf("strong");
    }
    else
    {
        printf("Weak");
    }
    return 0;
}
