package com.ylesb.springframework.beans.factory;

import com.ylesb.springframework.beans.BeansException;


public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
