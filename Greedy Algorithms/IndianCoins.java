import java.util.ArrayList;

//in this greedy approach is firslty giving bigger notes to reduce efforts so loop running from descending order.
//check the logic behind the code.

public class IndianCoins {
      public static void main(String[] args) {
     int Notes[] = {1,2,5,10,20,50,100,200,500,2000};
     ArrayList<Integer> GivenNote = new ArrayList<>();

    //  Arrays.sort(Notes,Comparator.reverseOrder());

     int NumOfNotes = 0;
     int amount = 5900;  //2000 2000 500 500 500 200 200

     for(int i=Notes.length-1;i>=0;i--){

        if(Notes[i]<=amount){
            while (Notes[i]<=amount) {
                NumOfNotes++;
                amount -= Notes[i];
                GivenNote.add(Notes[i]);
            }
        }
     }

     System.out.println("Total Notes used: "+NumOfNotes);
     System.out.println("Notes are : ");

     for(int i=0;i<GivenNote.size();i++){
        System.out.print(GivenNote.get(i)+" ");
     }
}
}