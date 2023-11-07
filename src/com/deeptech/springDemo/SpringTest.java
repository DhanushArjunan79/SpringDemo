package com.deeptech.springDemo;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringTest {

    public static void main(String[] args) {
        Resource res = new ClassPathResource("ApplicationContext.xml");
        XmlBeanFactory factory = new XmlBeanFactory(res);
        Student student = (Student) factory.getBean("stu");
        student.display();
    }
}
