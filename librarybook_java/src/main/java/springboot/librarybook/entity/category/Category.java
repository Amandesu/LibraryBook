package springboot.librarybook.entity.category;

import java.io.Serializable;

public class Category implements Serializable {
    private Integer categoryid;

    private String categoryname;

    private Integer secondcatid;

    private String secondcatname;

    private static final long serialVersionUID = 1L;

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    public Integer getSecondcatid() {
        return secondcatid;
    }

    public void setSecondcatid(Integer secondcatid) {
        this.secondcatid = secondcatid;
    }

    public String getSecondcatname() {
        return secondcatname;
    }

    public void setSecondcatname(String secondcatname) {
        this.secondcatname = secondcatname == null ? null : secondcatname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", categoryid=").append(categoryid);
        sb.append(", categoryname=").append(categoryname);
        sb.append(", secondcatid=").append(secondcatid);
        sb.append(", secondcatname=").append(secondcatname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}