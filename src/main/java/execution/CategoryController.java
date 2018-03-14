package execution;

import Facades.CategoryFacade;
import Model.Category;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by mabook on 11/03/18.
 */
@RestController
public class CategoryController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method= RequestMethod.GET ,  value="/categories", headers = "Accept=application/json")
    public ArrayList<Category> categories(@RequestParam(value="id", defaultValue= "1") int id) {

        ArrayList<Category> returnedCats = new CategoryFacade().getCategories();
        return returnedCats;
    }

}
