public class FoodComposition {
    private String mainFood;
    private String ingredients;
    private Animal owner;


    public  FoodComposition(){}
    public  FoodComposition(String mainFood,String ingredients,Animal owner){
        this.ingredients = ingredients;
        this.mainFood = mainFood;
        this.owner = owner;
    }
    public void setMainFood(String mainFood) {
        this.mainFood = mainFood;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getMainFood() {
        return mainFood;
    }

    public Animal getOwner() {
        return owner;
    }
}
