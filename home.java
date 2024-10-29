package cn.edu.lntu.homeyuyue;

public class home {
    String name;
    int area;
    int nof;

    public home() {
    }

    public home(String name, int area, int nof) {
        this.name = name;
        this.area = area;
        this.nof = nof;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return area
     */
    public int getArea() {
        return area;
    }

    /**
     * 设置
     * @param area
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     * 获取
     * @return nof
     */
    public int getNof() {
        return nof;
    }

    /**
     * 设置
     * @param nof
     */
    public void setNof(int nof) {
        this.nof = nof;
    }

    public String toString() {
        return "home{name = " + name + ", area = " + area + ", nof = " + nof + "}";
    }
}
