package mealtracker;

import java.time.LocalDateTime;
import java.util.List;

public class Meal {
    private List<Food> foods;
    private String name;
    private LocalDateTime mealTime;

    Meal(String name, List<Food> foods, LocalDateTime mealTime){
        this.name = name;
        this.foods = foods;
        this.mealTime = mealTime;
    }

    double getCalories(){
        double calories = 0;

        for (Food food : this.foods){
            calories += food.getCalories();
        }

        return calories;
    }

    double getFat() {
        double fat = 0;

        for (Food food : this.foods) {
            fat += food.getFat();
        }

        return fat;
    }

    double getCarbs() {
        double carbs = 0;

        for (Food food : this.foods) {
            carbs += food.getCarbohydrates();
        }
        return carbs;
    }

    double getProtein() {
        double protein = 0;

        for (Food food : this.foods){
            protein += food.getProtein();
        }

        return protein;
    }

    String getName() {

        return this.name;
    }

    LocalDateTime getMealTime() {
        return this.mealTime;
    }

    void viewFoods() {
        for (Food food : this.foods){
            System.out.println(food.getName());
        }
    }

    public boolean isComplete() {
        boolean hasFat = false, hasProtein = false, hasVegetable = false, hasFruit = false;
        for (Food food : this.foods){
            List<Category> categories = food.getCategories();
            if (categories.contains(Category.Fat)) {
                hasFat = true;
            }
            if (categories.contains(Category.Protein)) {
                hasProtein = true;
            }
            if (categories.contains(Category.Vegetable)) {
                hasVegetable = true;
            }
            if (categories.contains(Category.Fruit)) {
                hasFruit = true;
            }
        }

        return hasFat && hasProtein && hasFruit && hasVegetable;
    }
};