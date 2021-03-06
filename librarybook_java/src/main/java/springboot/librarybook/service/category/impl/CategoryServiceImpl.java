package springboot.librarybook.service.category.impl;

import org.springframework.stereotype.Service;
import springboot.librarybook.dao.category.CategoryMapper;
import springboot.librarybook.dao.category.CategoryMapperExt;
import springboot.librarybook.entity.category.Category;
import springboot.librarybook.entity.category.CategoryCriteria;
import springboot.librarybook.service.category.CategoryService;

import springboot.librarybook.service.category.impl.res.GetCategoriesRes;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryMapperExt CategoryMapperExt;

    @Resource
    private CategoryMapper  CategoryMapper;

    @Override
    public GetCategoriesRes getCategories() {

        CategoryCriteria example = new CategoryCriteria();
        List<Category> allList =CategoryMapperExt.getCategories(example);


        GetCategoriesRes res = new GetCategoriesRes(allList);
        res.setCode(200);
        res.setMsg("查询成功");
        return res;
    }

    @Override
    public Map getSecCatById(int id) {
        CategoryCriteria example = new CategoryCriteria();

        example.createCriteria().andParentidEqualTo(id);
        List list = CategoryMapper.selectByExample(example);

        Map map = new HashMap();
        map.put("body", list);
        map.put("code", 200);
        return map;
    }
}
