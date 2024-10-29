package cn.edu.lntu.homeyuyue;

public class People {
    String dh;
    String mm;

    public People() {
    }

    public People(String dh, String mm) {
        this.dh = dh;
        this.mm = mm;
    }

    /**
     * 获取
     * @return dh
     */
    public String getDh() {
        return dh;
    }

    /**
     * 设置
     * @param dh
     */
    public void setDh(String dh) {
        this.dh = dh;
    }

    /**
     * 获取
     * @return mm
     */
    public String getMm() {
        return mm;
    }

    /**
     * 设置
     * @param mm
     */
    public void setMm(String mm) {
        this.mm = mm;
    }

    public String toString() {
        return "People{dh = " + dh + ", mm = " + mm + "}";
    }
}
