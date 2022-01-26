import java.util.*;

public class LongestSubString{
    static int longSub(String s){
          int mx=Integer.MIN_VALUE;
          int count = 0;
          int visited[] = new int[256];
          for(int i=0 ; i<s.length() ; i++){
              int first = (int) s.charAt(i);
              if(visited[first] == 0){
                visited[first]++;
                count++;
              }
              else{
                   Arrays.fill(visited,0);
                   mx = Math.max(mx,count);
                   count = 0;
                   i--;
              } 
          }
          mx = Math.max(mx,count);
          return mx;
    }
   

    public static void main(String []args){
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longSub(s));
    }
}