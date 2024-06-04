import java.util.Scanner;

public class Student_grade_tracker {
    public static void main(String[] args) {
        int total=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the subject no: ");
        int subno=sc.nextInt();
        int[] subarr=new int[subno];
        System.out.println("Enter subject marks: ");
        for(int i=0;i<subno;i++){
            System.out.println("Enter num of"+(i+1)+" ");
             subarr[i]=sc.nextInt();
             total=total+subarr[i];
        }
        float avg=total/subno;
        System.out.println("Average Mark is = "+avg);
        for(int i=0;i<subarr.length-1;i++){
            for(int j=0;j<subarr.length-1-i;j++){
                if(subarr[j]>subarr[j+1]){
                    int temp=subarr[j];
                    subarr[j]=subarr[j+1];
                    subarr[j+1]=temp;
                }
                          
                
            }
            

        }
        System.out.println("Lowest Marks: ");
            System.out.println(subarr[0]);
            System.out.println("Highest Marks: ");
            System.out.println(subarr[subarr.length-1]);
            System.out.print("The student Grade is: ");
            if(avg>=80)
            {
                System.out.print("A");
            }
            else if(avg>=60 && avg<80)
            {
               System.out.print("B");
            } 
            else if(avg>=40 && avg<60)
            {
                System.out.print("C");
            }
            else
            {
                System.out.print("D");
            }
    
    }
    
}
