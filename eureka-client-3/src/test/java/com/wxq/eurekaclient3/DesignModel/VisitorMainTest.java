package com.wxq.eurekaclient3.DesignModel;

import com.wxq.eurekaclient3.DesignModel.VisitorModel.*;

/**
 * Created by wenxuqiao on 2019/4/3 10:51
 *
 * @Description 访问者模式测试
 */
public class VisitorMainTest {

    public static void main(String[] args) {
        //创建全职员工和兼职员工
        IEmployee employee1=new FullTimeEmployee("文许桥",40,1000);
        IEmployee employee2=new FullTimeEmployee("范华燃",46,2200);
        IEmployee employee3=new FullTimeEmployee("杨东",37,1100);
        IEmployee employee4=new PartTimeEmployee("张聪",20,12);
        IEmployee employee5=new PartTimeEmployee("向权科",40,8);
        //添加员工
        EmployeeList employeeList=new EmployeeList();
        employeeList.addEmployee(employee1);
        employeeList.addEmployee(employee2);
        employeeList.addEmployee(employee3);
        employeeList.addEmployee(employee4);
        employeeList.addEmployee(employee5);
        //创建访问者
        FinanceDepartment financeDepartment=new FinanceDepartment();
        HrDepartment hrDepartment=new HrDepartment();
        //人力资源部统计时间
        employeeList.show(hrDepartment);
        //财务部统计工资
        employeeList.show(financeDepartment);
    }
}
