package com.apptrics.SpringSample.SpringFrameWork;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.apptrics.spring.pojo.Employee;
import com.apptrics.spring.pojo.Student;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Resource obj = new ClassPathResource("SpringConfiguration2.xml"); 
    	try {
			BeanFactory bean = new XmlBeanFactory(obj);
			
			Employee employee= (Employee) bean.getBean("employee");
			Student student = (Student)bean.getBean("student");
			
			System.out.println(student.toString());
			System.out.println(employee.toString());
		
    	} catch (BeansException e) {
			e.printStackTrace();
		}
    }
}
