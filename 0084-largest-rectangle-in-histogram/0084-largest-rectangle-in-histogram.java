import java.util.Stack;
class Pair{
    int price;
    int span;
    Pair(int price, int span){
        this.price = price;
        this.span = span;
    }
}

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Pair> stack1 = new Stack<>();
        List<Integer> list1 = new ArrayList<>();
        // calculating NSL here!
        for(int i=0;i<heights.length;i++){
            if(stack1.size() == 0){
                list1.add(-1);
            } else if (stack1.size() > 0 && stack1.peek().price < heights[i]){
                list1.add(stack1.peek().span);
            } else if (stack1.size() > 0 && stack1.peek().price >= heights[i]){
                while(stack1.size() > 0 && stack1.peek().price >= heights[i]){
                    stack1.pop();
                }
                if(stack1.size() == 0){
                    list1.add(-1);
                } else {
                    list1.add(stack1.peek().span);
                }
            }
            stack1.push(new Pair(heights[i], i));
        }


        Stack<Pair> stack2 = new Stack<>();
        List<Integer> list2 = new ArrayList<>();
        // calculating NSR here!
        for(int i=heights.length - 1;i>=0;i--){
            if(stack2.size() == 0){
                list2.add(heights.length);
            } else if (stack2.size() > 0 && stack2.peek().price < heights[i]){
                list2.add(stack2.peek().span);
            } else if (stack2.size() > 0 && stack2.peek().price >= heights[i]){
                while(stack2.size() > 0 && stack2.peek().price >= heights[i]){
                    stack2.pop();
                }
                if(stack2.size() == 0){
                    list2.add(heights.length);
                } else {
                    list2.add(stack2.peek().span);
                }
            }
            stack2.push(new Pair(heights[i], i));
        }
        Collections.reverse(list2);

        int max = Integer.MIN_VALUE;
        for(int i =0;i<heights.length;i++){
            max = Math.max(max, (Math.abs(list1.get(i) - list2.get(i)) - 1)*heights[i]);
        }

        return max;
    }
}