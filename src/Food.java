import java.util.ArrayList;

public class Food {
    private double getCalories;
    private double getFat;
    private double getCarbohydrates;
    private double getProtein;
    private double getName;

    Food (String name, double carbs, double fat, double protein, Category category){
        this.Name = name;
        this.Category = category;
        this.Carbs = carbs;
        this.Fat = fat;
        this.Protein = protein;
        this.Calories = calculateCalories(carbs, fat, protein);
}

    double calculateCalories(double carbs, double fat, double protein){
        return (9 * fat) + (4 * carbs) + (4 * protein);
    }

    double getCalories(){

        return this.Calories;
    }

    double getCarbs(){

        return this.Carbs;
    }

    Category getCategory(){

        return this.Category;
    }

    double getFat(){

        return this.Fat;
    }

    double getProtein(){

        return this.Protein;
    }

    String getName(){

        return this.Name;
    }


    void addCategory (Category category){

        this.getCategories.add(category);
    }
}