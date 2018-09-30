public class Meal {
    private double getCalories;
    private double getFat;
    private double getCarbohydrates;
    private double getProtein;
    private string getName;
    private DateTime getMealTime;
    private void viewFoods;
}

    double getCalories(){
        double calories = 0;

        for (Food food : this.Foods){
            calories += food.getCalories();
        }

        return calories;
    }

    double getFat() {
        double fat = 0;

        for (Food food : this.Foods) {
            fat += food.getFat();
        }

        return fat;
    }

    double getCarbs() {
        double carbs = 0;

        for (Food food : this.Foods) {
            carbs += food.getCarbs();
        }
        return carbs;
    }

    double getProtein() {
        double protein = 0;

        for (Food food : this.Foods){
            protein += food.getProtein();
        }

        return protein;
    }

    String getName() {

        return this.Name;
    }

    String getMealTime() {
        return dtf.format(now);
    }


    void  addFood (Food food){

        this.Foods.add(food);
    }

    void viewFoods() {
        for (Food food : this.Foods){
            System.out.println(food.getName());
        }
    }
}