package springboot.librarybook.Controller.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springboot.librarybook.entity.category.Category;
import springboot.librarybook.service.category.CategoryService;
import springboot.librarybook.service.category.impl.res.GetCategoriesRes;

import java.util.List;


@RestController
@RequestMapping(value = "book")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "getCategories", method = RequestMethod.GET)
    public GetCategoriesRes index(String userName){

        GetCategoriesRes list =  categoryService.getCategories();

        return  list;

    }
}
