package revature;

import java.util.*;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final DishType type;

    public Dish(String name, boolean vegetarian, int calories, DishType type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public DishType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                '}';
    }

    public static final List<Dish> menu =
            Arrays.asList(
                    new Dish("pork", false, 800, DishType.MEAT),
                    new Dish("beef", false, 700, DishType.MEAT),
                    new Dish("chicken", false, 400, DishType.MEAT),
                    new Dish("french fries", true, 530, DishType.OTHER),
                    new Dish("rice", true, 350, DishType.OTHER),
                    new Dish("season fruit", true, 120, DishType.OTHER),
                    new Dish("pizza", true, 550, DishType.OTHER),
                    new Dish("prawns", false, 400, DishType.FISH),
                    new Dish("salmon", false, 450, DishType.FISH));

    private static List<String> getLowCalDishes(List<Dish> dishList) {
        List<Dish> lowCalDishes = new ArrayList<>();
        for (Dish d : dishList) {
            if (d.getCalories() < 500) {
                lowCalDishes.add(d);
            }
        }
        lowCalDishes.sort(new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(), o2.getCalories());
            }
        });
        List<String> lowCalDishName = new ArrayList<>();
        for (Dish dish : lowCalDishes) {
            lowCalDishName.add(dish.getName());
        }
        return lowCalDishName;
    }
    // need to display low calorie dishes first
    public static void main(String[] args) {
        List<Dish> dishList = Dish.menu;
        List<String> dishNames = getLowCalDishes(dishList);
        System.out.println(dishNames);

        // stream example
        String[] menuLine = {
                "pizza,bread sticks,calzone",
                "fries,burger,pickles",
                "veggie bowl,fried rice"
        };
        Arrays
                .stream(menuLine)
                .flatMap(line -> Arrays.stream(line.split(",")))
                .forEach(System.out::println);
    }
}


