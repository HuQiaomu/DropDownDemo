package com.example.dropdowndemo;
public class DropDownItem {

    private String code;
    private String value;
    
    
    public DropDownItem(String code, String value) {
        super();
        this.code = code;
        this.value = value;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    
    
    
}
