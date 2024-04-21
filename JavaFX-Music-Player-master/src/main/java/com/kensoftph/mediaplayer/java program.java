#include<stdio.h>
void selection sort(int array[],int n)
{
    int i,j,min_index,temp;
    for(i=0;i<n-1;j++){
        min_index=1;
        for(j=i+1;j<n;j++)
        {
            if(array[j]<array[min_iindex])
            {
                min_index=j
            }
        }
        temp=array[i];
        array[i]=array[min_index];
        array[min_index]=temp;
        }
        printf("\n sorted array:\n");
        for(int i=0;i<n;i++){
            printf("5d",array[i]);
        }
        printf("\n");
    }
    int main(){
        int array[]={64,25,12,22,11};
        printf("\array size=%",size of(array[0]));
        printf("\n array[0] size=%d",size of (array[0]));
        int n=size of (array)/size of (array[0]);
        printf("\n *** N value=%d",n);
    printf("\n original array:\n")
for(int i=0;i<n;i++){
    printf("%d",array[i]);
}   
printf("\n");
selectionsort(array,n);
return 0
 }
}