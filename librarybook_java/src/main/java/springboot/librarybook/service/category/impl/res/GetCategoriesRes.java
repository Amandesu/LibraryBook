package springboot.librarybook.service.category.impl.res;

import springboot.librarybook.entity.category.Category;

import javax.swing.*;
import java.util.*;

public class GetCategoriesRes {
    private int code;
    private String msg;
    private List body = new ArrayList();

    public GetCategoriesRes(){

    }
    public GetCategoriesRes(List<Category> allList){

        HashMap<Integer, Item> map =  new HashMap();
        ArrayList catList = new ArrayList();
        for (Category cat:allList) {
            int id = cat.getCategoryid();
            if (map.get(id) == null) {
                map.put(id,  createItem());
            }
            Item item = map.get(id);
            item.setCategoryId(cat.getCategoryid());
            item.setCategoryName(cat.getCategoryname());
            List list = item.getList();
            list.add(new SecondCat(cat.getSecondcatid(), cat.getSecondcatname()));
            item.setList(list);
        }
        for (Map.Entry<Integer, Item> entry : map.entrySet()) {
            catList.add(entry.getValue());
        }
        setBody(catList);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List getBody() {
        return body;
    }

    public void setBody(List body) {
        this.body = body;
    }
    public Item createItem(){
        return new Item();
    }

    public  class  SortByCid implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            Item s1 = (Item) o1;
            Item s2 = (Item) o2;
            if (s1.categoryId > s2.categoryId)
                return 1;
            return 0;

        }
    }
    public class Item {
        private  int categoryId;
        private  String categoryName;
        private  List list = new ArrayList();

        public int getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(int categoryId) {
            this.categoryId = categoryId;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public List getList() {
            return list;
        }

        public void setList(List list) {
            this.list = list;
        }
    }


    public class SecondCat{
        private  int secondCatId;
        private  String  secondCatName;

        public SecondCat(int id, String  name) {
            this.secondCatId = id;
            this.secondCatName = name;
        }

        public int getSecondCatId() {
            return secondCatId;
        }

        public void setSecondCatId(int secondCatId) {
            this.secondCatId = secondCatId;
        }

        public String getSecondCatName() {
            return secondCatName;
        }

        public void setSecondCatName(String secondCatName) {
            this.secondCatName = secondCatName;
        }
    }
}

