package springboot.librarybook.entity.book;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {
    private Integer id;

    private String categoryname;

    private Integer categoryid;

    private String name;

    private Integer collectcount;

    private Integer favoritecount;

    private String downloadlink;

    private String secondcatname;

    private Integer secondcatid;

    private Date createdate;

    private Integer score;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCollectcount() {
        return collectcount;
    }

    public void setCollectcount(Integer collectcount) {
        this.collectcount = collectcount;
    }

    public Integer getFavoritecount() {
        return favoritecount;
    }

    public void setFavoritecount(Integer favoritecount) {
        this.favoritecount = favoritecount;
    }

    public String getDownloadlink() {
        return downloadlink;
    }

    public void setDownloadlink(String downloadlink) {
        this.downloadlink = downloadlink == null ? null : downloadlink.trim();
    }

    public String getSecondcatname() {
        return secondcatname;
    }

    public void setSecondcatname(String secondcatname) {
        this.secondcatname = secondcatname == null ? null : secondcatname.trim();
    }

    public Integer getSecondcatid() {
        return secondcatid;
    }

    public void setSecondcatid(Integer secondcatid) {
        this.secondcatid = secondcatid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryname=").append(categoryname);
        sb.append(", categoryid=").append(categoryid);
        sb.append(", name=").append(name);
        sb.append(", collectcount=").append(collectcount);
        sb.append(", favoritecount=").append(favoritecount);
        sb.append(", downloadlink=").append(downloadlink);
        sb.append(", secondcatname=").append(secondcatname);
        sb.append(", secondcatid=").append(secondcatid);
        sb.append(", createdate=").append(createdate);
        sb.append(", score=").append(score);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}