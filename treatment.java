import java.util.*;
import java.lang.*;

class treatment {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.next();
        
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        System.out.print("Enter Body Temperature in Celcius : ");
        float temp = sc.nextFloat();

        System.out.println("\n\n-----SYMPTOMS-----");
        System.out.println("1. Restlessness\n2. Tiredness\n3. Head Ache\n4. Block or Running Nose\n5. Sneezing\n6. Cough\n7. Body Pain\n8. Breathing Problem\n9. Vomit\n10. Stomach Ache");
        System.out.println("11. Weakness\n12. Sweat\n13. Sour Taste\n14. Burning in Stomach\n15. Other Problem\n");

        int flag = 0;
        int a=0, b=0, c=0, d=0, e=0, f=0, g=0, h=0, i=0, j=0, k=0, l=0, m=0, n=0, o=0, p=0;

        while(flag == 0) {
            System.out.println("\nEnter Symptoms : ");
            int ab = sc.nextInt();
            System.out.println("Type 99 to Exit");

            switch(ab) {
                case 1 : a=1;
                        flag = 0;
                        break;
                case 2 : b=1;
                        flag = 0;
                        break;
                case 3 : c=1;
                        flag = 0;
                        break;
                case 4 : d=1;
                        flag = 0;
                        break;
                case 5 : e=1;
                        flag = 0;
                        break;
                case 6 : f=1;
                        flag = 0;
                        break;
                case 7 : g=1;
                        flag = 0;
                        break;
                case 8 : h=1;
                        flag = 0;
                        break;
                case 9 : i=1;
                        flag = 0;
                        break;
                case 10 : j=1;
                        flag = 0;
                        break;
                case 11 : k=1;
                        flag = 0;
                        break;
                case 12 : l=1;
                        flag = 0;
                        break;
                case 13 : m=1;
                        flag = 0;
                        break;
                case 14 : n=1;
                        flag = 0;
                        break;


                case 15 : System.out.println("Please Consult a Doctor!!");
                        flag = 1;
                        break;
                case 99 : flag = 1;
                        break;
                default : System.out.println("Invalid Entry!!");
                        flag = 1;
                        break;
            }
        }

        
        if(a==1 && b==1 && c==1) {
            System.out.println("\nYour are going through Depression and Anxiety.");
            System.out.println("Do Meditation and Yoga.");
            System.out.println("Take leave from college and go for an outing.");
            System.out.println("Consult a Doctor.");
        }
        else if(d==1 && e==1 && f==1) {
            System.out.println("\nYou have Common Cold or Flu.");
            System.out.println("Drink hot and plenty of Water, Take Dolo tablet.");
            System.out.println("If situation not under control, Consult a Doctor.");
        }
        else if(f==1 && g==1 && h==1 && (temp>=98)) {
            System.out.println("\nYou have COVID-19");
            System.out.println("Isolate yourself to avoid spreading.");
            System.out.println("Immediately consult a Doctor.");
        }
        else if(i==1 && j==1 && k==1) {
            System.out.println("\nYou have Food Poisoning");
            System.out.println("Avoid eating junk food and drink plenty of water.");
        }
        else if(c==1 && l==1 && g==1 && i==1) {
            System.out.println("\nYou have Dengue or Malaria");
            System.out.println("Prevent yourself from contact with mosquito.");
            System.out.println("Take Dolo tablet and Consult a Doctor.");
        }
        else if(m==1 && n==1) {
            System.out.println("\nYou have Acidity");
            System.out.println("Have Glocone D, and avoid junk food");
        }
        else if(temp >= 98){
            System.out.println("\nYou are having a high fever!!");
        }
        else {
            System.out.println("\nYou are completely fine!!");
            System.out.println("Attend classses because you dont have Doctors prescription!!");
        }

    }
}