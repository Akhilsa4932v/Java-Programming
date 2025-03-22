public static ArrayList<Integer> summing(int arr[],int target){

    ArrayList<Integer> al = new ArrayList<>();

    for(int i=0;i<arr.length;i++){
      int sum = 0;
      for(int j=i;j<arr.length;j++){
        sum += arr[j];

        if(sum == target){
          al.add(i+1);
          al.add(j+1);
          return al;
        }
      }
    }
     al.add(-1);
     return al;
  }
  public static void main(String args[]){
    int arr[] = {1,3,4,7,28,92,0};
    ArrayList<Integer> ans = summing(arr,92);
    System.out.println(ans);
    
  }