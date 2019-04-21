package springboot.librarybook.service.category;
import springboot.librarybook.entity.category.Category;
import springboot.librarybook.service.category.impl.res.GetCategoriesRes;

import java.util.List;


public interface CategoryService {

    GetCategoriesRes getCategories();
}
