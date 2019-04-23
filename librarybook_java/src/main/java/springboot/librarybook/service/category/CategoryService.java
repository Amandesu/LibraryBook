package springboot.librarybook.service.category;
import springboot.librarybook.entity.category.Category;
import springboot.librarybook.service.category.impl.res.GetCategoriesRes;

import java.util.List;
import java.util.Map;


public interface CategoryService {

    GetCategoriesRes getCategories();
    Map getSecCatById(int id);
}
