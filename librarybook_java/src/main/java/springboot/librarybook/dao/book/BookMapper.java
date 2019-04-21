package springboot.librarybook.dao.book;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import springboot.librarybook.entity.book.Book;
import springboot.librarybook.entity.book.BookCriteria;

public interface BookMapper {
    int countByExample(BookCriteria example);

    int deleteByExample(BookCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    int insertSelective(Book record);

    List<Book> selectByExample(BookCriteria example);

    Book selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookCriteria example);

    int updateByExample(@Param("record") Book record, @Param("example") BookCriteria example);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}