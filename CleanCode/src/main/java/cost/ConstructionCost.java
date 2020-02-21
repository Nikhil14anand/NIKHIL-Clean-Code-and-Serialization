package cost;

public class ConstructionCost {

    private static final int material_standard = 1000;
    private static final int material_mediumStandard = 1500;
    private static final int material_highStandard = 2000;
    private static final int highMaterialCost_WithAutomation = 2500;

    private static String[] materialsList = new String[]{"Standard Material", "Medium Standard Material", "High Standard Material"};

    public static double calculateCost(String selectedMaterial, double area, boolean requireAutomation )
    {
        if (area == 0) {
            throw new RuntimeException();
        }
        
        else if(selectedMaterial.equalsIgnoreCase(materialsList[0])) {
            double ans = area * material_standard;
            return ans;
        }

        else if(selectedMaterial.equalsIgnoreCase(materialsList[1])) {
            double ans = area * material_mediumStandard;
            return ans;
        }

        else if (selectedMaterial.equalsIgnoreCase(materialsList[2]))
        {
            double ans;
            if (requireAutomation) {
                ans = area * highMaterialCost_WithAutomation;
                return ans;
            }
            ans = area*material_highStandard;
            return ans;
        }
        else
            throw new RuntimeException();

    }

    public static String[] MaterialsList() {
        return materialsList;
    }

}

