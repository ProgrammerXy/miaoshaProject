package com.miaoshaproject.error;

public interface CommontError {
    public int getErrCode();
    public String getErrMsg();
    public CommontError setErrMsg(String ErrMsg);
}
