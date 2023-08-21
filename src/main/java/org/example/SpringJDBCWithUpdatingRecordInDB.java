package org.example;


import org.example.dao.UpdateRecordDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJDBCWithUpdatingRecordInDB {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        UpdateRecordDao updateRecordDao = applicationContext.getBean("JDBCUpdateDao", UpdateRecordDao.class);

        int introCount = updateRecordDao.updateProjects(1,"Record Updated");
        System.out.println("Record Updated of id number:"+introCount);
    }
}