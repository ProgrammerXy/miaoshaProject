package com.miaoshaproject.validator;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

@Component
public class ValidatorImpl implements InitializingBean {
    private Validator validator;

    //实现校验方法并返回检验结果
    public ValidationResult validationResult(Object bean){
        final ValidationResult result = new ValidationResult();
        Set<ConstraintViolation<Object>> validateSet = validator.validate(bean);
        if(validateSet.size()>0){
            //有错误
            result.setHasError(true);
            validateSet.forEach(validate->{
                String errMsg = validate.getMessage();
                String property = validate.getPropertyPath().toString();
                result.getErrorMsgMap().put(property,errMsg);
            });
        }
        return result;
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        //讲hibernate validator通过工厂的初始化方法实例化
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }
}
