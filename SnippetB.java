//The bug here is that the switch statements lack break statement for each case.
public class SnippetB {
    public static void main(String[] args) {

        int option = 2; 
switch (option) { 
case 1: System.out.println("Deposit"); 
break;
case 2: System.out.println("Withdraw"); 
break;
case 3: System.out.println("Balance");
break;
}

}
}
