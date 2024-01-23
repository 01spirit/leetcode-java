package 圆和矩形是否有重叠;

public class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {

        if(yCenter>=y1&&yCenter<=y2){
            if(xCenter>=x2&&xCenter-radius<=x2||xCenter<=x1&&xCenter+radius>=x1||xCenter>=x1&&xCenter<=x2){
                return true;
            }
        }
        if(xCenter>=x1&&xCenter<=x2){
            if(yCenter<=y1&&yCenter+radius>=y1||yCenter>=y2&&yCenter-radius<=y2||yCenter>=y1&&yCenter<=y2){
                return true;
            }
        }
        if(xCenter<=x1&&yCenter<=y1){
            if((x1-xCenter)*(x1-xCenter)+(y1-yCenter)*(y1-yCenter)<=radius*radius){
                return true;
            }
        }
        if(xCenter>=x2&&yCenter<=y1){
            if((x2-xCenter)*(x2-xCenter)+(y1-yCenter)*(y1-yCenter)<=radius*radius){
                return true;
            }
        }
        if(xCenter>=x2&&yCenter>=y2){
            if((x2-xCenter)*(x2-xCenter)+(y2-yCenter)*(y2-yCenter)<=radius*radius){
                return true;
            }
        }
        if(xCenter<=x1&&yCenter>=y2){
            if((x1-xCenter)*(x1-xCenter)+(y2-yCenter)*(y2-yCenter)<=radius*radius){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int radius = 1, xCenter = 0, yCenter = 0, x1 = 1, y1 = -1, x2 = 3, y2 = 1;
        System.out.println(sol.checkOverlap(radius = 1, xCenter = 1, yCenter = 1, x1 = 1, y1 = -3, x2 = 2, y2 = -1));
    }
}
