package springboot.librarybook.dao.category;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import springboot.librarybook.entity.category.Category;
import springboot.librarybook.entity.category.CategoryCriteria;

public interface CategoryMapper {
    int countByExample(CategoryCriteria example);

    int deleteByExample(CategoryCriteria example);

    int insert(Category record);

    int insertSelective(Category record);

    List<Category> selectByExample(CategoryCriteria example);
    List<Category> getCategories(CategoryCriteria example);

    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryCriteria example);

    int updateByExample(@Param("record") Category record, @Param("example") CategoryCriteria example);


}