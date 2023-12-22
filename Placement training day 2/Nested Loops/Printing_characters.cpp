#include<stdio.h>
#include<string.h>
int main()
{
    char input1[] = "a1b10";
    char input2[] = "b3c6d15";
    int i=0,count,length2;
    printf("%s\n",input1);
    while(input1[i]!='\0')
    {
        char c = input1[i];
        int count=0;
        i++;

        while(input1[i]>='0' && input1[i]<= '9')
        {
            count = count * 10 + (input1[i] - '0');
            i++;
        }
        
        for(int j=0;j<count;j++){
            printf("%c",c);
        }
    }
    printf("\n");
    printf("%s\n",input2);
    i=0;
     while(input2[i]!='\0')
    {
        char c = input2[i];
        int count=0;
        i++;
        
        while(input2[i]>='0' && input2[i]<= '9')
        {
            count = count * 10 + (input2[i] - '0');
            i++;
        }
        
        for(int j=0;j<count;j++){
            printf("%c",c);
        }
        
    }
    /*length2 = strlen(input2);
    for(i=0;i<length2;i++)
    {
        char ch = input2[i];
        count = 0;
        for(int j=i+1;j<length2;j++)
        {
            if(input2[j]>='0' && input2[j]<= '9')
            {
                count = count * 10 + (input2[i] - '0');
            }
        }
         for(int j=0;j<count;j++){
            printf("%c",ch);
        }*/
        
        
    
}
