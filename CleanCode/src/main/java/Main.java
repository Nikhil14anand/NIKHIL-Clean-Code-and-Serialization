import java.util.*;
import cost.ConstructionCost;
import interest.CompoundInterest;
import interest.SimpleInterest;

class Main {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter c for Construction Cost or i for Interest:");
        char ch=sc.next().toLowerCase().charAt(0);

        switch(ch){

            case 'i':
                System.out.println("FOR SIMPLE INTEREST ENTER S . FOR COMPOUND INTEREST ENTER C  :");
                double p,r,t;
                switch (sc.next().toLowerCase().charAt(0)){
                    case 's':
                        System.out.println("Enter Principal Amount:");
                        p=sc.nextDouble();
                        System.out.println("Enter Rate of Interest:");
                        r=sc.nextDouble();
                        System.out.println("Enter Duration in Years:");
                        t=sc.nextDouble();
                        System.out.println("Simple Interest= "+SimpleInterest.calculate(p,t,r));
                        break;

                    case 'c':
                        System.out.println("Enter Principal Amount:");
                        p=sc.nextDouble();
                        System.out.println("Enter Rate of Interest:");
                        r=sc.nextDouble();
                        System.out.println("Enter Duration in Years:");
                        t=sc.nextDouble();
                        System.out.println("Compound Interest= "+CompoundInterest.calculate(p,t,r));
                        break;

                    default:
                        System.err.println("Wrong Choice...");
                }
                break;

            case 'c':
                
                String[] materials = ConstructionCost.MaterialsList();
                
                for (int index = 0; index < materials.length; index++)
                    System.out.println("Enter " + (index + 1) + " to select " + materials[index]);

                byte selectMaterial = (byte) (sc.nextByte() - 1);
                
                System.out.println("Enter the Area of the house...");
                double area = sc.nextDouble();
                
                boolean requireAutomation = false;
                if(materials[selectMaterial].equals("High Standard Material"))
                {
                    System.out.println("Enter \"True\" if you need automation or else enter \"False\"...");
                    requireAutomation = sc.nextBoolean();
                }
                
                System.out.println(ConstructionCost.calculateCost(materials[selectMaterial], area, requireAutomation));
                break;
            
            default:
                System.err.println("Wrong Choice...");



        }
    }
}
