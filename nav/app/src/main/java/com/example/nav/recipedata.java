package com.example.nav;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
/**
 * recipe database
 */
public class recipedata extends SQLiteOpenHelper {
    /**
     * database version
     */
    private static final int DATABASE_VERSION = 1;
    /**
     * database name
     */
    private static final String DATABASE_NAME = "recipemanager";
    /**
     * database table name
     */
    private static final String TABLE_RECIPE = "Recipe";
    /**
     * database handler
     */
    private static databasehandler dbhelper;
    /**
     * text used in SQL table
     */
    private static final String RECIPE_NAME = "Recipe_name";
    private static final String FOOD_ITEM = "Food_item";
    private static final String Cooking_Recipe = "recipe";
    private static final String  CALORIES = "calories";

    /**
     * constructor
     *
     * @param context where to construct the database
     */
    public recipedata(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    /**
     * initialize database and add data into
     *
     * data from"
     * Healthy Ways to Lose Weight. (2021). EatingWell. https://www.eatingwell.com/category/4236/weight-loss/
     */
    @Override
    public void onCreate(SQLiteDatabase db){
    String CREATE_TABLE_RECIPE = "CREATE TABLE " + TABLE_RECIPE +" (id INTEGER PRIMARY KEY AUTOINCREMENT,Recipe_name TEXT,Food_item TEXT,recipe TEXT,calories REAL)";
        db.execSQL(CREATE_TABLE_RECIPE);

        addrecipe(new recipe_items_model("Mediterranean Chickpea Quinoa Bowl","1 (7 ounce) jar roasted red peppers, rinsed\n" +
                "¼ cup slivered almonds\n" +
                "4 tablespoons extra-virgin olive oil, divided\n" +
                "1 small clove garlic, minced\n" +
                "1 teaspoon paprika\n" +
                "½ teaspoon ground cumin\n" +
                "¼ teaspoon crushed red pepper (optional)\n" +
                "2 cups cooked quinoa\n" +
                "¼ cup Kalamata olives, chopped\n" +
                "¼ cup finely chopped red onion\n" +
                "1 (15 ounce) can chickpeas, rinsed\n" +
                "1 cup diced cucumber\n" +
                "¼ cup crumbled feta cheese\n" +
                "2 tablespoons finely chopped fresh parsley","Step 1\n" +
                "Place peppers, almonds, 2 tablespoons oil, garlic, paprika, cumin and crushed red pepper (if using) in a mini food processor. Puree until fairly smooth.\n" +
                "\n" +
                "Step 2\n" +
                "Combine quinoa, olives, red onion and the remaining 2 tablespoons oil in a medium bowl.\n" +
                "\n" +
                "Step 3\n" +
                "To serve, divide the quinoa mixture among 4 bowls and top with equal amounts of the chickpeas, cucumber and the red pepper sauce. Sprinkle with feta and parsley.",479),db);        addrecipe(new recipe_items_model("lose weight","1 (7 ounce) jar roasted red peppers, rinsed\n" +
                "¼ cup slivered almonds\n" +
                "4 tablespoons extra-virgin olive oil, divided\n" +
                "1 small clove garlic, minced\n" +
                "1 teaspoon paprika\n" +
                "½ teaspoon ground cumin\n" +
                "¼ teaspoon crushed red pepper (optional)\n" +
                "2 cups cooked quinoa\n" +
                "¼ cup Kalamata olives, chopped\n" +
                "¼ cup finely chopped red onion\n" +
                "1 (15 ounce) can chickpeas, rinsed\n" +
                "1 cup diced cucumber\n" +
                "¼ cup crumbled feta cheese\n" +
                "2 tablespoons finely chopped fresh parsley","Step 1\n" +
                "Place peppers, almonds, 2 tablespoons oil, garlic, paprika, cumin and crushed red pepper (if using) in a mini food processor. Puree until fairly smooth.\n" +
                "\n" +
                "Step 2\n" +
                "Combine quinoa, olives, red onion and the remaining 2 tablespoons oil in a medium bowl.\n" +
                "\n" +
                "Step 3\n" +
                "To serve, divide the quinoa mixture among 4 bowls and top with equal amounts of the chickpeas, cucumber and the red pepper sauce. Sprinkle with feta and parsley.",479),db);

        addrecipe(new recipe_items_model("Green Goddess Salad with Chickpeas","3 cups chopped romaine lettuce\n" +
                "1 cup sliced cucumber\n" +
                "1 (15 ounce) can chickpeas, rinsed\n" +
                "¼ cup diced low-fat Swiss cheese\n" +
                "6 cherry tomatoes, halved if desired","Step 1\n" +
                "To prepare dressing: Place avocado, buttermilk, herbs, vinegar and salt in a blender. Puree until smooth.\n" +
                "\n" +
                "Step 2\n" +
                "To prepare salad: Toss lettuce and cucumber in a bowl with 1/4 cup of the dressing. Top with chickpeas, cheese and tomatoes. (Refrigerate the extra dressing for up to 3 days.)",304 ),db);
        addrecipe(new recipe_items_model("Sausage, Pepper & Potato Packets","3 medium Yukon Gold or red potatoes (about 1 pound), cut into 1/4 inch slices\n" +
                "3 cups 1-inch bell pepper pieces\n" +
                "4 links cooked chicken sausage (12 ounces), cut into 1/2 inch slices\n" +
                "2 cups sliced onions\n" +
                "2 tablespoons extra-virgin olive oil\n" +
                "1 teaspoon smoked paprika\n" +
                "½ teaspoon dried thyme\n" +
                "½ teaspoon salt\n" +
                "½ teaspoon ground pepper","Step 1\n" +
                "Combine potatoes, peppers, sausage, onions, oil, paprika, thyme, salt and pepper in a large bowl.\n" +
                "\n" +
                "Step 2\n" +
                "Cut 8 pieces of heavy-duty foil, about 12 by 17 inches each. Coat one piece with cooking spray. Place about 2 cups of the potato mixture in the center of the coated foil and enclose like a package. Place seam-side down on a second piece of foil and enclose again so the potato mixture is wrapped in a double-thick packet. Repeat with the remaining foil and potato mixture, making 4 total packets.\n" +
                "\n" +
                "Step 3\n" +
                "Prepare a campfire and let it burn down to the coals. Cook the packets 4 to 6 inches above the coals, turning once or twice, until vegetables are tender, about 25 minutes.",345),db);
        addrecipe(new recipe_items_model("Toaster-Oven Tostadas","2 corn tortillas\n" +
                "½ cup canned black beans, rinsed\n" +
                "2 tablespoons shredded Cheddar cheese\n" +
                "2 teaspoons freshly squeezed lime juice\n" +
                "2 teaspoons extra-virgin olive oil\n" +
                "2 cups mixed salad greens\n" +
                "¼ avocado, mashed\n" +
                "2 tablespoons pico de gallo or salsa","Step 1\n" +
                "Line a toaster-oven pan with foil and arrange tortillas on it. Top the tortillas with beans and cheese. Toast until the cheese is melted and the tortillas are starting to brown along the edges, 7 to 8 minutes.\n" +
                "\n" +
                "Step 2\n" +
                "Meanwhile, place greens in an individual salad bowl. Drizzle lime juice and oil over the greens.\n" +
                "\n" +
                "Step 3\n" +
                "Remove the tostadas from the toaster oven and top with avocado and pico de gallo (or salsa). Serve hot with the dressed greens.",457 ),db);
        addrecipe(new recipe_items_model("Two-Cheese Fusilli with Marinated Tomatoes","4 cups chopped tomatoes (1 1/2 pounds)\n" +
                "2 tablespoons red-wine vinegar\n" +
                "2 cloves garlic, minced\n" +
                "½ teaspoon salt\n" +
                "8 ounces whole-wheat fusilli\n" +
                "1 cup finely diced fontina cheese\n" +
                "½ cup whole-milk ricotta cheese, at room temperature\n" +
                "2 tablespoons plus 2 teaspoons extra-virgin olive oil\n" +
                "¼ cup thinly sliced fresh basil\n" +
                "Freshly ground pepper to taste","Step 1\n" +
                "Put a large pot of water on to boil.\n" +
                "\n" +
                "Step 2\n" +
                "Combine tomatoes, vinegar, garlic and salt in a large bowl. Set aside to marinate.\n" +
                "\n" +
                "Step 3\n" +
                "Cook pasta according to package directions. Reserve 1/2 cup pasta water, then drain. Immediately return the pasta to the pot. Add fontina and the reserved cooking liquid; stir constantly until the cheese is melted. Fold in ricotta. Transfer to a serving bowl or individual pasta bowls.\n" +
                "\n" +
                "Step 4\n" +
                "Using a slotted spoon, spoon the marinated tomatoes over the pasta. (Discard the marinating liquid.) Drizzle with oil and top with basil and a generous grinding of pepper.",500 ),db);
        addrecipe(new recipe_items_model("Vegetable Weight-Loss Soup","2 tablespoons extra-virgin olive oil\n" +
                "1 medium onion, chopped\n" +
                "2 medium carrots, chopped\n" +
                "2 stalks celery, chopped\n" +
                "12 ounces fresh green beans, cut into 1/2-inch pieces\n" +
                "2 cloves garlic, minced\n" +
                "8 cups no-salt-added chicken broth or low-sodium vegetable broth\n" +
                "2 (15 ounce) cans low-sodium cannellini or other white beans, rinsed\n" +
                "4 cups chopped kale\n" +
                "2 medium zucchini, chopped\n" +
                "4 Roma tomatoes, seeded and chopped\n" +
                "2 teaspoons red-wine vinegar\n" +
                "¾ teaspoon salt\n" +
                "½ teaspoon ground pepper\n" +
                "8 teaspoons prepared pesto","Step 1\n" +
                "Heat oil in a large pot over medium-high heat. Add onion, carrot, celery, green beans and garlic. Cook, stirring frequently, until the vegetables begin to soften, about 10 minutes. Add broth and bring to a boil. Reduce heat to a simmer and cook, stirring occasionally, until the vegetables are soft, about 10 minutes more.\n" +
                "\n" +
                "Step 2\n" +
                "Add white beans, kale, zucchini, tomatoes, vinegar, salt and pepper. Increase heat to return to a simmer; cook until the zucchini and kale have softened, about 10 minutes. Top each serving of soup with 1 teaspoon pesto.",225 ),db);
        addrecipe(new recipe_items_model("Easy Chicken Enchilada Casserole","1 (28 ounce) can crushed tomatoes (3 cups)\n" +
                "2 tablespoons ground cumin\n" +
                "1/2-1 teaspoon ground chipotle chile powder\n" +
                "¼ teaspoon salt\n" +
                "8 corn tortillas, cut into wedges\n" +
                "1 (15 ounce) can black beans, rinsed and drained\n" +
                "1 cup chopped Meal-Prep Sheet-Pan Chicken Thighs (see associated recipe)\n" +
                "2 cups Sautéed Peppers & Onions (see associated recipe)\n" +
                "1 ½ cups shredded Mexican cheese blend (6 ounces), divided","Step 1\n" +
                "Stir tomatoes, cumin, chile powder and salt together in a medium bowl. Coat a 7- or 8-by-11-inch casserole dish with cooking spray. Spoon 1/2 cup of the tomato sauce into the bottom of the prepared dish. Arrange 1/3 of the tortilla wedges over the tomato sauce. Top with half of the beans, half of the chicken and half of the pepper mixture. Top with 1 cup sauce and 1/2 cup cheese.\n" +
                "\n" +
                "Step 2\n" +
                "Layer on half the remaining tortillas. Top with the remaining beans, chicken and pepper mixture. Top with 1 cup of the sauce and 1/2 cup cheese. Layer on the remaining tortillas, followed by the remaining sauce (about 1/3 cup). Sprinkle with the remaining 1/2 cup cheese. Cover with foil and refrigerate until ready to cook, up to 3 days.\n" +
                "\n" +
                "Step 3\n" +
                "Preheat oven to 375 degrees F. Bake the casserole, uncovered, until hot and bubbling, 35 to 40 minutes. (Alternatively, microwave the casserole, covered with wax paper, on Medium-High until steaming hot, 12 to 15 minutes.) Serve hot.",365 ),db);
        addrecipe(new recipe_items_model("Meal-Prep Roasted Vegetable Bowls with Pesto","3 tablespoons extra-virgin olive oil, divided\n" +
                "½ teaspoon garlic powder\n" +
                "¼ teaspoon salt\n" +
                "¼ teaspoon ground pepper\n" +
                "4 cups broccoli florets\n" +
                "2 medium red bell peppers, quartered\n" +
                "1 cup sliced red onion\n" +
                "3 cups cooked brown rice\n" +
                "1 (15 ounce) can chickpeas, rinsed\n" +
                "4 tablespoons prepared pesto","Step 1\n" +
                "Preheat oven to 450 degrees F.\n" +
                "\n" +
                "Step 2\n" +
                "Whisk 2 tablespoons oil, garlic powder, salt and pepper together in a large bowl. Add broccoli, peppers and onion; toss to coat. Transfer to a large rimmed baking sheet and roast, stirring once, until the vegetables are tender, about 20 minutes. Chop the peppers when cool enough to handle.\n" +
                "\n" +
                "Step 3\n" +
                "Stir the remaining 1 tablespoon oil into rice. Place about 3/4 cup of the rice in each of four 2-cup microwave-safe, lidded containers. Divide chickpeas and the roasted vegetables among the bowls. Top each with 1 tablespoon pesto.\n" +
                "\n" +
                "Step 4\n" +
                "To reheat: Microwave each container on High until heated through, 1 to 2 minutes.",484 ),db);
        addrecipe(new recipe_items_model("Stuffed Sweet Potato with Hummus Dressing","1 large sweet potato, scrubbed\n" +
                "¾ cup chopped kale\n" +
                "1 cup canned black beans, rinsed\n" +
                "¼ cup hummus\n" +
                "2 tablespoons water","Step 1\n" +
                "Prick sweet potato all over with a fork. Microwave on High until cooked through, 7 to 10 minutes.\n" +
                "\n" +
                "Step 2\n" +
                "Meanwhile, wash kale and drain, allowing water to cling to the leaves. Place in a medium saucepan; cover and cook over medium-high heat, stirring once or twice, until wilted. Add beans; add a tablespoon or two of water if the pot is dry. Continue cooking, uncovered, stirring occasionally, until the mixture is steaming hot, 1 to 2 minutes.\n" +
                "\n" +
                "Step 3\n" +
                "Split the sweet potato open and top with the kale and bean mixture. Combine hummus and 2 tablespoons water in a small dish. Add additional water as needed to reach desired consistency. Drizzle the hummus dressing over the stuffed sweet potato.",472 ),db);
        addrecipe(new recipe_items_model("Black Bean-Quinoa Bowl","¾ cup canned black beans, rinsed\n" +
                "⅔ cup cooked quinoa\n" +
                "¼ cup hummus\n" +
                "1 tablespoon lime juice\n" +
                "¼ medium avocado, diced\n" +
                "3 tablespoons pico de gallo\n" +
                "2 tablespoons chopped fresh cilantro","Step 1\n" +
                "Combine beans and quinoa in a bowl. Stir hummus and lime juice together in a small bowl; thin with water to desired consistency. Drizzle the hummus dressing over the beans and quinoa. Top with avocado, pico de gallo and cilantro.",500 ),db);
        addrecipe(new recipe_items_model("Baked Spinach & Feta Pasta","1 (5-ounce) block feta cheese\n" +
                "8 cups lightly packed baby spinach (about 5 ounces)\n" +
                "3 tablespoons extra-virgin olive oil\n" +
                "2 large cloves garlic, minced\n" +
                "1 teaspoon dried dill\n" +
                "¼ teaspoon kosher salt\n" +
                "¼ teaspoon ground pepper\n" +
                "8 ounces penne or rotini\n" +
                "2 cups boiling water","Step 1\n" +
                "Preheat oven to 400°F.\n" +
                "\n" +
                "Step 2\n" +
                "Place feta in the center of a 9-by-13-inch baking dish. Bake until softened and starting to brown, about 15 minutes.\n" +
                "\n" +
                "Step 3\n" +
                "Meanwhile, combine spinach, oil, garlic, dill, salt and pepper in a large bowl. Use your hands to massage the spinach until it's reduced in volume by half. Stir in pasta.\n" +
                "\n" +
                "Step 4\n" +
                "After the feta has baked for 15 minutes, add the spinach and pasta mixture to the baking dish. Pour boiling water over the mixture and gently stir. Cover with foil and bake until the pasta is tender, about 18 minutes. Remove from the oven and stir. Cover and let stand for at least 3 minutes before serving.",394 ),db);
        addrecipe(new recipe_items_model("Pressure-Cooker Grain Bowl","4 tablespoons extra-virgin olive oil, divided\n" +
                "1 large sweet potato (about 1 pound), peeled and cut into 1 1/2-inch pieces\n" +
                "1 cup quinoa, preferably red\n" +
                "2 tablespoons harissa (see Tips) or hot sauce, divided\n" +
                "1 large clove garlic, minced\n" +
                "½ teaspoon salt\n" +
                "4 cups chopped kale\n" +
                "2 cups water\n" +
                "1 tablespoon lime juice\n" +
                "1 (15 ounce) can no-salt-added chickpeas, rinsed, warmed if desired\n" +
                "¼ cup sliced scallion\n" +
                "¼ cup chopped unsalted pistachios","Step 1\n" +
                "Heat 2 tablespoons oil on sauté mode in the electric pressure cooker. (No sauté mode? See Tips.) Add sweet potato, quinoa, 1 tablespoon harissa (or hot sauce), garlic and salt. Cook, stirring, until the garlic is fragrant, about 2 minutes. Turn off the heat. Stir in kale and water. Close and lock the lid. Cook at high pressure for 8 minutes.\n" +
                "\n" +
                "Step 2\n" +
                "Release the pressure. Remove the lid and let stand for 5 minutes.\n" +
                "\n" +
                "Step 3\n" +
                "Meanwhile, combine the remaining 2 tablespoons oil, the remaining 1 tablespoon harissa (or hot sauce) and lime juice in a small bowl.\n" +
                "\n" +
                "Step 4\n" +
                "Divide the quinoa mixture among 4 bowls. Top each portion with chickpeas, scallion and pistachios. Drizzle with the sauce.",514 ),db);
        addrecipe(new recipe_items_model("Stuffed Eggplant with Couscous & Almonds","⅔ cup water plus 1 tablespoon, divided\n" +
                "½ cup whole-wheat couscous (see Tip)\n" +
                "½ teaspoon salt, divided\n" +
                "2 medium eggplants (about 1 pound each)\n" +
                "3 tablespoons extra-virgin olive oil, divided\n" +
                "¼ teaspoon ground pepper\n" +
                "1 clove garlic, finely chopped\n" +
                "⅓ cup mayonnaise\n" +
                "2 teaspoons harissa paste or 1/2 teaspoon harissa seasoning\n" +
                "½ cup chopped smoke-flavored almonds\n" +
                "½ cup chopped fresh parsley","Step 1\n" +
                "Preheat grill to medium-high.\n" +
                "\n" +
                "Step 2\n" +
                "Combine 2/3 cup water, couscous and 1/8 teaspoon salt in a small saucepan. Bring to a boil over high heat. Remove from heat, cover and set aside.\n" +
                "\n" +
                "Step 3\n" +
                "Halve eggplants through the stem; brush the cut sides with 2 tablespoons oil and sprinkle with 1/4 teaspoon salt and pepper. Grill the eggplants, flipping once halfway, until charred and tender, 10 to 12 minutes. Let cool for 5 minutes.\n" +
                "\n" +
                "Step 4\n" +
                "Meanwhile, mash garlic with the remaining 1/8 teaspoon salt on a cutting board with a fork. Combine the garlic paste, mayonnaise, harissa and the remaining 1 tablespoon water in a small bowl.\n" +
                "\n" +
                "Step 5\n" +
                "Leaving a 1/4-inch-thick wall, carefully scoop out the eggplant flesh and chop. Stir the eggplant flesh into the couscous along with almonds, parsley and the remaining 1 tablespoon oil. Mound the filling in the eggplant shells. Serve with the sauce.",457 ),db);
    }
    /**
     * add new recipe into database
     */
    public void addrecipe(recipe_items_model recipe_items_model, SQLiteDatabase db ) {
        ContentValues values = new ContentValues();
        values.put(RECIPE_NAME, recipe_items_model.getRecipe_name());
        values.put(FOOD_ITEM, recipe_items_model.getfood_item());
        values.put(Cooking_Recipe, recipe_items_model.getCookingrecipe());
        values.put(CALORIES, recipe_items_model.getcalorie());
        db.insert(TABLE_RECIPE, null, values);
    }
    /**
     * upgrade database
     */
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_RECIPE);
        onCreate(sqLiteDatabase);
    }
    /**
     * get all recipes as a list
     */
    public List<recipe_items_model> getAllrecipes() {
        List<recipe_items_model> recipe_list = new ArrayList<>();
        String selectQuery = "SELECT  * FROM " + TABLE_RECIPE;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                recipe_items_model recipe_item = new recipe_items_model();
                recipe_item.setRecipe_name(cursor.getString(cursor.getColumnIndex(RECIPE_NAME)));
                recipe_item.setfood_item(cursor.getString(cursor.getColumnIndex(FOOD_ITEM)));
                recipe_item.setCookingrecipe(cursor.getString(cursor.getColumnIndex(Cooking_Recipe)));
                recipe_item.setcalorie((int) Float.parseFloat(cursor.getString(cursor.getColumnIndex(CALORIES))));
                recipe_list.add(recipe_item);
            } while (cursor.moveToNext());
        }
        return recipe_list;
    }
}
