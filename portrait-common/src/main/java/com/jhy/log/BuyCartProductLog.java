package com.jhy.log;

import java.io.Serializable;

/**
 * 用户行为日志结构以及实体定义-购物车行为实体
 *
 * Created by JHy on 2019/04/26.
 */
public class BuyCartProductLog implements Serializable{
     private int productid;         // 商品id
     private int producttypeid;     // 商品类别id
     private String operatortime;   // 操作时间
     private int operatortype;      // 操作类型 0、加入；1、删除
     private int userid;            // 用户id
     private int terminaltype;      // 终端类型：0、pc端；1、移动端；2、小程序端'
     private String ip;             // 用户ip

    private String brand;           // 品牌

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getProducttypeid() {
        return producttypeid;
    }

    public void setProducttypeid(int producttypeid) {
        this.producttypeid = producttypeid;
    }

    public String getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(String operatortime) {
        this.operatortime = operatortime;
    }

    public int getOperatortype() {
        return operatortype;
    }

    public void setOperatortype(int operatortype) {
        this.operatortype = operatortype;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getTerminaltype() {
        return terminaltype;
    }

    public void setTerminaltype(int terminaltype) {
        this.terminaltype = terminaltype;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
