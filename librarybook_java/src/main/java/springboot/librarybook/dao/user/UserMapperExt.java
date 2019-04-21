package springboot.librarybook.dao.user;

        import org.apache.ibatis.annotations.Param;

public interface UserMapperExt {

    Long selectIdByUserName(@Param("userName") String userName);
}
