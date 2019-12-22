package com.miaoshaproject.error;

public class BusinessException extends Exception implements CommontError{
    private  CommontError commontError;

    //直接接收EemBusinessError的传参用于构造业务异常
    public BusinessException (CommontError commontError){
        super();
        this.commontError=commontError;
    }

    //接收自定义ErrMsg的方式构造业务异常
    public BusinessException(CommontError commontError,String errMsg){
        super();
        this.commontError=commontError;
        this.commontError.setErrMsg(errMsg);
    }


    @Override
    public int getErrCode() {
        return this.commontError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commontError.getErrMsg();
    }

    @Override
    public CommontError setErrMsg(String errMsg) {
         this.commontError.setErrMsg(errMsg);
         return this;

    }
}
