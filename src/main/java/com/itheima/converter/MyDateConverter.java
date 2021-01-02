package com.itheima.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 *     自定义类型转换器，使用@DateTimeformat替换
 * 泛型参数1：提交的参数类型
 * 泛型参数2: 转换后的类型
 *
 * 在springmvc.xml配置它
 * </p>
 *
 * @author: Eric
 * @since: 2020/12/28
 */
public class MyDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
