package entity;

/**
 * 底层采漏的
 */
public class BottomLost {
    public String BID; //weibo_bottom
    public String aUrl;//weibo_all
    public String AID;//weibo_all

    public String getSID() {
        return BID;
    }

    public void setSID(String SID) {
        this.BID = SID;
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

    @Override
    public String toString() {
        return "BottomLost{" +
                "BID='" + BID + '\'' +
                ", aUrl='" + aUrl + '\'' +
                ", AID='" + AID + '\'' +
                '}';
    }
}
