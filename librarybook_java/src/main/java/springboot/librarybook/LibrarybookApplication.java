package springboot.librarybook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("springboot.librarybook.dao")
@SpringBootApplication(scanBasePackages = {"springboot.librarybook","springboot.librarybook.*"})
public class LibrarybookApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibrarybookApplication.class, args);
    }

}
