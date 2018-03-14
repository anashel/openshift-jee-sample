package Facades;

import Data.CategoryDAO;
import Model.Category;

import java.util.ArrayList;

/**
 * Created by mabook on 11/03/18.
 */
public class CategoryFacade {
    public ArrayList<Category> categories;
    public CategoryFacade() {
        categories = new ArrayList<Category>();
    }
    public ArrayList<Category> getCategories(){
        return new CategoryDAO().getCategories();
    }

}
