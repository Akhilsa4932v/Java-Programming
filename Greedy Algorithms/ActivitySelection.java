import java.util.*;
public class ActivitySelection{

    //if given end-time arr is already in sorted form

    /*
     * public static void main(String[] args) {
        
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        

        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        int maxActivity = 1;
        int lastActivityTime = end[0];

        for(int i=1;i<end.length;i++){
            if(start[i]>=lastActivityTime){
                maxActivity++;
                lastActivityTime = end[i];
                al.add(i);

            }
        }

        //printing activities
        System.out.println("MaxActivities:"+maxActivity);
        for(int i=0;i<al.size();i++){
            System.out.print("A"+al.get(i)+" ");
        }
    
    }
     */

//if given end-time arr is not in sorted form
//.firstly sort the tasks based on end times by using comparators and then find max activites;

    public static void main(String[] args) {
        
        int start[] = {0,1,3,5,5,8};
        int end[] = {6,2,4,7,9,9};

        //using 2d array to sort the given data based on end time.
        int Activities[][] = new int[start.length][3];

        for(int i=0;i<start.length;i++){
            Activities[i][0] = i;
            Activities[i][1] = start[i];
            Activities[i][2] = end[i];
        }

        //sort 2d array (Lamda func -->shorform)
        Arrays.sort(Activities,Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        int max = 0;

        //add first task
        max = 1;
        ans.add(Activities[0][0]);
        int lastEndTime = Activities[0][2];

        for(int i=1;i<end.length;i++){
            if(Activities[i][1]>lastEndTime){
                max++;
                ans.add(Activities[i][0]);
                lastEndTime = Activities[i][2];
            }
        }

        System.out.println("Max Activity = "+max);
        //print ans
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        
    }
}