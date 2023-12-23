#include <stdio.h>
#include<math.h>
int main() {
    int i,n,new_val=0;
    printf("Enter the size of the array: ");
    scanf("%d",&n);
    int arr1[n],arr2[n];
    
    printf("Enter the array: ");
    for(i=1;i<=n;i++){
        scanf("%d",&arr1[i]);
    }
    
    printf("digits = [");
    for(i=1;i<=n;i++)
    {
        printf("%d,",arr1[i]);
    }
    printf("\b]");
    
    arr1[n] += 1;
    //delimiter = ',';
    
    for(i=n;i>=1;i--){
        new_val = arr1[i]%10;
        arr1[i]=arr1[i]/10;
        n=n+1;
        arr1[i+1] = new_val;
        break;
        
    }
    printf("digits = [");
    for(i=1;i<=n;i++)
    {
        printf("%d,",arr1[i]);
    }
    printf("\b]");
}
