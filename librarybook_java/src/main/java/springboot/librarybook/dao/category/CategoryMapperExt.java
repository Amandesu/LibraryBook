package springboot.librarybook.dao.category;

import springboot.librarybook.entity.category.Category;
import springboot.librarybook.entity.category.CategoryCriteria;

import java.util.List;

public interface CategoryMapperExt {
    List<Category> getCategories(CategoryCriteria example);
}
