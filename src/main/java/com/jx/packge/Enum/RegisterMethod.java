package com.jx.packge.Enum;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

/**
 * @ClassName RegisterMethod
 * @Description TODO
 * @Author jx
 * @Date 2022/7/12 11:29
 */
public enum RegisterMethod{

    TEST(1,"手机","1111","TEST"),
    DEV(1,"手机","1111","DEV");



    RegisterMethod(Integer id, String name, String code, String ev) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.ev = ev;
    }

    private Integer id;
    private String name;
    private String code;
    private String ev;

    public String getEv() {
        return ev;
    }

    public void setEv(String ev) {
        this.ev = ev;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
