//The bug is that the condition hasPaid fees is already a boolean value so we dont need the comparison with the integer true. We can just use the variable hasPaidFees directly in the if statement.

public class SnippetA {
    public static void main(String[] args) {

        boolean hasPaidFees = false; 
if (hasPaidFees) { 
System.out.println("Access granted."); 
} else { 
System.out.println("Access denied.");
}
       
    }
    
}
