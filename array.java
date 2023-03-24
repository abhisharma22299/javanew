import java.util.Scanner;

public class array {


    static void frequencyArray(int arr[],int query){


        int [] fq=new int [100005];
        for (int i=0;i<arr.length;i++){
            fq[arr[i]]++;
        }
        Scanner sc =new Scanner(System.in);
        while(query>0){
            int num;
            System.out.println("ENTER THE VALUES TO BE SERARCHED:");
            num=sc.nextInt();
            if(fq[query]>0){
                System.out.println("NUMBER PRESENT IN THE ARRAY");

            }
            else {
                System.out.println("THE ARRAY IS NOT PRESENT IN THE ARRAY:");
            }
            query--;
        }



    }
    static void zeroAndOneArrangement(int arr[]){
        int numbersOfZero=0;
        //FIND NUMBER OF ZERO PRESENT IN THE ARRAY
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == 0) {
                numbersOfZero++;

            }
        }
            if (numbersOfZero==0){
                for (int j=0;j<arr.length;j++){
                    arr[j]=1;

                }
            }
            else {
                for (int j=0;j<numbersOfZero;j++){
                    arr[j]=0;

                }
                for (int k=numbersOfZero;k<arr.length;k++){
                    arr[k]=1;
                }

            }
        printArray(arr);
        }


    static void findPairSum(int a ,int b,int arr[]){
        int sum=a+b;
        int answer=0;
        for (int i=0;i<arr.length;i++){
            for (int j =i+1;j<arr.length;j++){
                if((arr[i]+arr[j]) == sum){
                    answer++;
                }
            }
        }
        if (answer==0){
            System.out.printf("THERE IS NO PAIR OF COMBINATION %d and %d  IS PRESENT",a,b);
        }
        else
        {
            System.out.printf("THRES IS %d PAIRS PRESENT IN THE ARRAY",answer);
        }
    }

    static void swapToNumberWithoutTemp(int a , int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a"+a+"b"+b);

    }
    static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void  reverseOfArray(int arr[]){


        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

printArray(arr);

    }
    static void  rotateArrayFromK(int arr[],int k){

        k=k%(arr.length);
        for (int i=0;i<k;i++){
            for (int j=arr.length-i;j<k;j++){
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
            }

        }
        printArray(arr);
    }
static int  findIntegerLenght(int num){
        int count=0;

        while (num!=0){
            num=num/10;
            count++;
        }
return count;
    }

    static void reverseNumber(int num){

        int lnght=findIntegerLenght(num);
        int rev=0,r2;
        for (int i=0;i<lnght;i++){
            r2=num%10;
            rev=(10*rev)+(r2);
            num=num/10;
        }
       // System.out.println(rev);
    }
    static void reverseArrayNumber(int arr[]){
        for (int i=0;i<arr.length;i++){
        int num=arr[i];
        int result=0;
        int numlength=findIntegerLenght(num);
            for (int j=0;j<numlength;j++){
                int rev=num%10;
                result=(result*10)+rev;
                 num=num/10;

            }
            arr[i]=result;
        }

        printArray(arr);

    }
    static void rearrangeZeroAndOneWithPointers(int arr[]){
        int left,right ;
        left=0;
        right=3;
       while(left<right) {

                if(arr[left]==1&&arr[right]==0){
                    int swap=arr[left];
                    arr[left]=arr[right];
                    arr[right]=arr[left];
left++;
right++;
                }

       }
       printArray(arr);

    }
static void printAllSubArray(int arr[]){
    for (int i=0;i<arr.length;i++){
        for (int j=i;j<arr.length;j++){
        for (int k=i;k<j;k++){
            System.out.println(arr[k]);
        }

            System.out.println("");
        }

    }
}

      public static void main(String[] args) {
            int arr[]={1,2,3,4};
            //findPairSum(4,3,arr);
          //  swapToNumberWithoutTemp(10,20);
        // reverseOfArray(arr);
    //rotateArrayFromK(arr,2);


//frequencyArray(arr,5);
       //   reverseOfArray(arr);
//reverseNumber(45782);
//reverseArrayNumber(arr);

//zeroAndOneArrangement(arr);
//rearrangeZeroAndOneWithPointers(arr);
          printAllSubArray(arr);
    }
}
