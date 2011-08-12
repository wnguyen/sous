package sous;

import java.util.Collections;
import java.util.List;

/**
 * The class provides access to the database.
 * <p/>
 * This class exposes relatively simple queries. Clients are of course
 * free to further filter the returned Lists in order to simulate
 * complex queries.
 */
public class Database {
    /**
     * Returns all recipes.
     * @return all recipes
     */
    public List<Recipe> allRecipes() {
        return Collections.emptyList();
    }
    
    /**
     * Finds recipes by name.
     * @param name name of recipe
     * @param strict if {@code true}, name must match exactly
     * @return list of recipes
     */
    public List<Recipe> findByName(String name, boolean strict) {
        return Collections.emptyList();
    }

    /**
     * Finds recipes by ingredients.
     * <p/>
     * At least one ingredient is required. Additional ingredients may
     * be provided, but are not necessary.
     * @param ing an ingredient
     * @param ings additional ingredients
     * @return list of recipes
     */
    public List<Recipe> findByIngs(String ing, String... ings) {
        return Collections.emptyList();
    }

    /**
     * Find recipes by cooking time.
     * @param min minimum time
     * @param max maximum time
     * @return list of recipes
     */
    public List<Recipe> findByCookTime(int min, int max) {
        return Collections.emptyList();
    }

    /**
     * Find recipes by prep time.
     * @param min minimum time
     * @param max maximum time
     * @return list of recipes
     */
    public List<Recipe> findByPrepTime(int min, int max) {
        return Collections.emptyList();
    }

    /**
     * Find recipes by total time.
     * @param min minimum time
     * @param max maximum time
     * @return list of recipes
     */
    public List<Recipe> findByTotalTime(int min, int max) {
        return Collections.emptyList();
    }

    /**
     * Find recipes by meal type.
     * @param meal meal type
     * @return list of recipes
     */
    public List<Recipe> findByMeal(String meal) {
        return Collections.emptyList();
    }

    /**
     * Find recipes by cuisine type.
     * @param cuisine cuisine type
     * @return list of recipes
     */
    public List<Recipe> findByCuisine(String cuisine) {
        return Collections.emptyList();
    }
}
