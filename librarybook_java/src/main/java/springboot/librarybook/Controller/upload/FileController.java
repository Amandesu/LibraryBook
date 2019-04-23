package springboot.librarybook.Controller.upload;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping(value = "upload")
public class FileController {
   /* @Autowired
    private CategoryService categoryService;*/

    @RequestMapping(value = "file", method = RequestMethod.POST)
    public Map uploadFile(MultipartFile file)  throws ServletException, IOException {
        String name = file.getOriginalFilename();
        name = formatName(name);
        outPutFile(file, "bookFile/"+name);
        Map map = new HashMap();
        map.put("url","http://localhost:8080/bookFile/"+name);
        map.put("name", name);
        map.put("status", "done");
        map.put("code", "200");
        return map;
    }

    @RequestMapping(value = "image", method = RequestMethod.POST)
    public Map uploadImage(MultipartFile file)  throws ServletException, IOException {
        String name = file.getOriginalFilename();
        name = formatName(name);
        outPutFile(file, "images/"+name);
        Map map = new HashMap();
        map.put("url","http://localhost:8080/images/"+name);
        map.put("name", name);
        map.put("status", "done");
        map.put("code", "200");
        return map;
    }

    public void outPutFile(MultipartFile file, String directory)  throws ServletException, IOException {
        InputStream inputStream = file.getInputStream();
        FileOutputStream fos = new FileOutputStream(new File("/Users/leiwuyi456/Desktop/LibraryBook/librarybook_java/target/classes/static/"+directory));
        byte[] bs = new byte[1024*10*1024];
        try{
            int len = 0;
            while ((len = inputStream.read(bs))!= -1){
                fos.write(bs,0,len);
            }
        } finally {
            fos.close();
        }
    }
    public String formatName(String name){
        String regEx="[^\u4e00-\u9fa5\\w.)(]";
        Pattern pattern   =   Pattern.compile(regEx);
        Matcher matcher   =   pattern.matcher(name);
        return matcher.replaceAll("").trim();
    }
}



