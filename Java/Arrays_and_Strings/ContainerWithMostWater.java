package Arrays_and_Strings;
import java.util.HashMap;
import java.util.Map;

/*
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

Notice that you may not slant the container.
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
In this case, the max area of water ( // section) the container can contain is 49.

8|    X              X
7|    X//////////////X/////X
6|    X//X///////////X/////X
5|    X//X/////X/////X/////X
4|    X//X/////X//X//X/////X
3|    X//X/////X//X//X//X//X
2|    X//X//X//X//X//X//X//X
1| X  X//X//X//X//X//X//X//X
0| _  _  _  _  _  _  _  _  _
   1  2  3  4  5  6  7  8  9
*/
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int max = 0;
        int area = 0;
        if(height.length == 0)
            return 0;

        for(int i=0; i < height.length; i++){
            for(int j = i + 1; j < height.length; j++){
                // if height[i] is less than height[j] height should be height[i] and base j - i  
                if(height[i] < height[j]){
                    area = height[i] * (j - i);
                    System.out.println("i: "+i+ " Square "+height[i]+"x"+(j - i)+" area: "+area);
                    //map.put("Square "+height[i]+"x"+j, area);
                }// if height[i] is less than height[j] height should be height[j] and base j - i  
                else{
                    area = height[j] * (j - i);
                    System.out.println("i: "+i+" Square "+height[j]+"x"+(j-i)+" area: "+area);
                    //map.put("Square "+height[j]+"x"+j, area);
                }
                
                if(max < area){
                    max = area;
                }
                    
            }
        }
        
        return max;
    }

    public static void main(String[] args){
        int[] numbers = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(numbers));

       
    }
}
