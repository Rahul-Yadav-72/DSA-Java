// Give a route containing 4 direction (E,W,N,S) find the shortest path to reach destination .
// "WNEENESENNN"

public class Q2_Shortest {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(getShortestPath(str));
    }
    public static float getShortestPath(String str){
        int x=0 , y=0;
        for(int i=0 ; i<str.length(); i++){
            char dir = str.charAt(i);
            if(dir == 'N'){ //North
                y++;
            }else if(dir == 'S'){ // South
                y--;
            }else if(dir == 'E'){ // East
                x++;
            }else{ // West
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float) Math.sqrt(X2+Y2);
    }
}
