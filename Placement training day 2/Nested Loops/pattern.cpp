#include<stdio.h>
int main(){
    int i,j,odd=1,even=2;
    for(i=1;i<=5;i++)
    {
        for(j=5;j>i;j--)
        {
            printf("\t");
        }
        for(j=0;j<i;j++)
        {
         if(i%2==1){
            printf("\t%d ",odd);
            odd+=2;
         }
         else{
             printf("\t%d ",even);
             even+=2;
         }
        }
        printf("\n");
        }
    return 0;
}
