package com.volcanno.spring.importbdreg;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * importbeandefinition
 *
 * @author vayne
 * @date 2020-02-25 21:59
 **/
public class DummyBeanRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        GenericBeanDefinition bd = new GenericBeanDefinition();
        bd.setBeanClass(DummyBean.class);
        bd.getPropertyValues().add("name", "vayne");
        registry.registerBeanDefinition("dummy", bd);
    }
}
