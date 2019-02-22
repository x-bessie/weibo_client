package entity;

/**
 * 采集采漏的
 */
public class ScrapyLost {
    public String SID; //weibo_scrapy
    public String aUrl;//weibo_all
    public String AID;//weibo_all
//    public String status; //weibo_all

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getaUrl() {
        return aUrl;
    }

    public void setaUrl(String aUrl) {
        this.aUrl = aUrl;
    }

    public String getAID() {
        return AID;
    }

    public void setAID(String AID) {
        this.AID = AID;
    }

//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }

    @Override
    public String toString() {
        return

                "aUrl=" + aUrl +
                        ", AID=" + AID +
                        ",SID=" + SID ;
    }
}
