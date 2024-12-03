package Stack;

import java.sql.SQLOutput;
import java.util.Stack;

public class QueueFrom2Stacks {

   private static Stack<Integer> stack1 = new Stack<>();
   private static Stack<Integer> stack2 =  new Stack<>();

    public static Integer stackPop(){

        if(stack2.isEmpty()){
           while(!stack1.isEmpty()){
               Integer popElement = stack1.pop();
               stack2.push(popElement);
           }
        }
        return stack2.pop();

    }


    public static void main(String[] args) {

        stack1.push(2);
        stack1.push(3);
        System.out.println(stackPop());
        stack1.push(5);
        stack1.push(6);
        System.out.println(stackPop());
        System.out.println(stackPop());




    }
}
