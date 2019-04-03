package com.wxq.eurekaclient3.DesignModel.VisitorModel;

/**
 * Created by wenxuqiao on 2019/4/3 9:55
 *
 * @Description 人力资源部门
 */
public class HrDepartment implements IDepartment{
    @Override
    public void view(IEmployee employee) {
        //全职员工
        if(employee instanceof FullTimeEmployee){
            FullTimeEmployee fullTimeEmployee=(FullTimeEmployee)employee;
            String name=fullTimeEmployee.name;
            double weekTime= fullTimeEmployee.weekTime;
            System.out.println(String.format("%s全职员工一周的工作时间是%sh", name,weekTime));
            if(weekTime<40){
                System.out.println(String.format("%s全职员工一周的请假时间是%sh", name,40-weekTime));
            }else if(weekTime>40){
                System.out.println(String.format("%s全职员工一周的加班时间是%sh", name,weekTime-40));
            }
        }
        //兼职员工
        else if(employee instanceof  PartTimeEmployee){
            PartTimeEmployee partTimeEmployee=(PartTimeEmployee) employee;
            String name=partTimeEmployee.name;
            double weekTime=partTimeEmployee.weekTime;
            System.out.println(String.format("%s兼职员工一周的工作时间是%sh", name,weekTime));
        }
    }
}
