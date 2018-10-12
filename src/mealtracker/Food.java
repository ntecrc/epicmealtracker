package mealtracker;

import mealtracker.Category;

import java.util.ArrayList;
import java.util.List;

public class Food {
    private double calories;
    private double fat;
    private double carbohydrates;
    private double protein;
    private List<Category> categories;
    private String name;

    Food (String name, double carbs, double fat, double protein, ArrayList<Category> categories){
        this.categories = categories;
        this.name = name;
        this.carbohydrates = carbs;
        this.fat = fat;
        this.protein = protein;
        this.calories = calculateCalories(carbs, fat, protein);
    }

    private static double calculateCalories(double carbs, double fat, double protein){
        return (9 * fat) + (4 * carbs) + (4 * protein);
    }

    double getCalories(){

        return this.calories;
    }

    double getCarbohydrates(){

        return this.carbohydrates;
    }

    ArrayList<Category> getCategories(){
        return (ArrayList)this.categories;
    }

    double getFat(){

        return this.fat;
    }

    double getProtein(){

        return this.protein;
    }

    String getName(){

        return this.name;
    }


    void addCategory (Category category){

        this.categories.add(category);
    }
}