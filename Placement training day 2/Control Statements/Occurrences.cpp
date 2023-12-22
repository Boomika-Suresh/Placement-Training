#include<stdio.h>
int main()
{
    int N,i,j,count;
    
    printf("Enter the number of elements N: ");
    scanf("%d",&N);
    int arr[N];
    printf("Enter the elements: ");
    for(i=0;i<N;i++){
        scanf("%d",&arr[i]);
    }
    printf("Array:{");
    for(i=0;i<N;i++){
        printf("%d,",arr[i]);
    }
    printf("\b}");
    
    //Counting the occurrences
    for(i=0;i<N;i++){
        count=1;
        for(j=i+1;j<N;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
        if (count>1){
                printf("\n%d->%d\n",arr[i],count);
        }
        i = i+count;
        
    }
    
}
