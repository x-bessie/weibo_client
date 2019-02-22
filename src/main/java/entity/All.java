package entity;

/**
 * 微博的搜索的全部链接:weibo_all
 */
public class All {
    public int id;
    public String AID;
    public String aUrl;
    public int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAID() {
        return AID;
    }

    public void setAID(String AID) {
        this.AID = AID;
    }

    public String getaUrl() {
        return aUrl;
    }

    public void setaUrl(String aUrl) {
        this.aUrl = aUrl;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", AID=" + AID +
                        ", aUrl=" + aUrl +
                        ", status=" + status;

    }
}
