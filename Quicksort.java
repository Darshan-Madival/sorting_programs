public class Quicksort {
    public static int partision(int a[],int low,int high){
        int pivot=a[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(a[j]<pivot){
                i++;

                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        System.out.println(i);
        i++;
        
        int temp=a[i];
        a[i]=pivot;
        a[high]=temp;
        // System.out.println(i);
        return i;

    }
    public static void quicksort(int a[],int low,int high){
    if(low<high){
        int pindx=partision(a,low,high);

        quicksort(a, low, pindx-1);
        quicksort(a, pindx+1, high);
    }
}
    public static void main(String[] args) {
        int[]a={12,45,23,78,90};
        int n=a.length;
        quicksort(a, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
    
}
