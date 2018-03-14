package Data;

import Model.Category;

import java.util.ArrayList;

/**
 * Created by mabook on 11/03/18.
 */
public class CategoryDAO {
    private ArrayList<Category> categories;

    public CategoryDAO() {
        categories = new ArrayList<Category>();
    }

    public ArrayList<Category> getCategories(){
    ArrayList<Category> createdCategories = new ArrayList<Category>();
    for (int i = 0; i < 10; i++)
    {
        Category cat = new Category(i, "myCatégory");
        createdCategories.add(cat);
    }
    return  createdCategories;
    }

}
