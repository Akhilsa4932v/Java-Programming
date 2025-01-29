package Strings;

// To reverse each word in the sentence while maintaining their order,
// we love coding
// ew evol gnidoc

public class Revrse_a_string {
    public class JavaBasic{
   
        public static String reverseWords(String str) {
            StringBuilder result = new StringBuilder();
            int start = 0;
    
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ' || i == str.length() - 1) {
                    int end = (str.charAt(i) == ' ') ? i - 1 : i;
                    for (int j = end; j >= start; j--) {
                        result.append(str.charAt(j));
                    }
                    if (i < str.length() - 1) {
                        result.append(' ');
                    }
                    start = i + 1;
                }
            }
    
            return result.toString();
        }
        public static void main(String[] args) {
            String input = "we love coding";
            System.out.println(reverseWords(input));
        }
    
       
    }
}

//2nd method 
// we love coding
// ew evol gnidoc

// public static String WordReverse(String str){
//     StringBuilder sb = new StringBuilder(str);

//     for(int i=0;i<sb.length()/2;i++){
//      int front = i;
//      int back = sb.length()-1-i;

//      char frontchar = sb.charAt(front);
//      char backchar = sb.charAt(back);

//      sb.setCharAt(front, backchar);
//      sb.setCharAt(back, frontchar);
//     }

//     return sb.toString();
//  }

//  public static String SentenceReverrse(String str){

//      StringBuilder sb = new StringBuilder();
//      String words[] = str.split(" ");

//      for(int i=0;i<words.length;i++){
       
//          String rev = WordReverse(words[i]);
//          sb.append(rev);

//          if(i!=words.length-1){
//              sb.append(" ");
//          }
//      }
//      return sb.toString();

//  }
    
    // we love coding
//  // coding love we
    
//  public static void reverse(String str){
//     String sentence = "we love coding";
    
//     // Split the sentence into words
//     String[] words = sentence.split(" ");  ---> ["we","love","coding"]
    
//     // Use StringBuilder to reverse the sentence
//     StringBuilder reversedSentence = new StringBuilder();
    
//     // Append words in reverse order
//     for (int i = words.length - 1; i >= 0; i--) {
//         reversedSentence.append(words[i]);
//         if (i != 0) { // Add a space after each word except the last
//             reversedSentence.append(" ");
//         }
//     }
    
//     // Print the reversed sentence
//     System.out.println(reversedSentence.toString());
// }



//akhil === likha

// public static String reverse(String str){

//     StringBuilder sb = new StringBuilder("");

//     for(int i=str.length()-1;i>=0;i--){
//         sb.append(str.charAt(i));
//     }

//     return sb.toString();
// }

//         public static void main(String[] args) {
//         String str = "akhil";
//         System.out.println(reverse(str));
       
//     }


//optimized code

// public static String reverse(){
//     StringBuilder sb = new StringBuilder("hello");
//     for(int i=0;i<sb.length()/2;i++)
//     {
//         int front = i;
//         int back = sb.length()-1-i;

//         char frontchar = sb.charAt(i);
//         char backchar = sb.charAt(back);

//         sb.setCharAt(front, backchar);
//         sb.setCharAt(back, frontchar);

//     }

//     System.out.println(sb);
// }

//if any doubt check apnacollege youtube , stringbuilder video.