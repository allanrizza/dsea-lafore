package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import datastructures.StackX;

public class Reverser {
    private String input;
    private String output;
    
    public Reverser(String in)
    { input = in; }

    public String doRev()
    {
        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);
        
        for(int j = 0; j < input.length(); j++)
        {
            char ch = input.charAt(j);
            theStack.push(ch);
        }
        output = "";
        while(!theStack.isEmpty())
        {
            char ch = theStack.pop();
            output = output + ch;
        }
        return output;
    }

    public static void example() throws IOException
    {
            String input, output;
            
                System.out.println("Enter a string: ");
                System.out.flush();
                input = getString();
                if(input.equals(""))
                    throw new IllegalArgumentException();

                Reverser theReverser = new Reverser(input);
                output = theReverser.doRev();
                System.out.println("Reversed: " + output);

            
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
