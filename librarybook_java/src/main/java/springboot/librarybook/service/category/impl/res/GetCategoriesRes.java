package springboot.librarybook.service.category.impl.res;
import java.util.*;
import springboot.librarybook.entity.category.Category;


public class GetCategoriesRes {
    private int code;
    private String msg;
    private List body = new ArrayList();

    public GetCategoriesRes(){

    }
    public GetCategoriesRes(List<Category> allList){

        Map<Integer, List> map =  new HashMap();
        List rootList = new ArrayList();   // 根节点



        for (Category cat:allList) {
            // 如果是根节点
            if (cat.getParentid() == null) {
                Item item = new Item();
                item.setCategoryId(cat.getCategoryid());
                item.setCategoryName(cat.getCategoryname());
                item.setChildren(new ArrayList());
                map.put(cat.getCategoryid(), item.getChildren());
                rootList.add(item);
            }
        }

        for (Category cat: allList) {
            Object parentId = cat.getParentid();
            List list = map.get(parentId);
            if (parentId != null) {
                list.add(cat);
            }
        }
        setBody(rootList);


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
        private  List children = new ArrayList();

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

        public List getChildren() {
            return children;
        }

        public void setChildren(List children) {
            this.children = children;
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

