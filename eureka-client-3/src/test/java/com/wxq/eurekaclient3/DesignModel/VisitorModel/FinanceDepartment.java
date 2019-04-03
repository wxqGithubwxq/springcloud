package com.wxq.eurekaclient3.DesignModel.VisitorModel;

import org.yaml.snakeyaml.events.Event;

/**
 * Created by wenxuqiao on 2019/4/3 9:45
 *
 * @Description 财务部门
 */
public class FinanceDepartment implements IDepartment {
    @Override
    public void view(IEmployee employee) {
        //全职员工
        if(employee instanceof FullTimeEmployee){
            FullTimeEmployee fullTimeEmployee=(FullTimeEmployee)employee;
            String name=fullTimeEmployee.name;
            double weekTime= fullTimeEmployee.weekTime;
            double weekSalary=fullTimeEmployee.weekSalary;
            if(weekTime<40){
                weekSalary=weekSalary-80*(40-weekTime);
                if (weekSalary<0){
                    weekSalary=0;
                }
            }else if(weekTime>40){
                weekSalary=weekSalary+100*(weekTime-40);
            }
            System.out.println(String.format("%s全职员工一周的工作工资是¥%s", name,weekSalary));
        }
        //兼职员工
        else if(employee instanceof  PartTimeEmployee){
            PartTimeEmployee partTimeEmployee=(PartTimeEmployee) employee;
            String name=partTimeEmployee.name;
            double weekTime=partTimeEmployee.weekTime;
            double hourSalary=partTimeEmployee.hourSalary;
            System.out.println(String.format("%s兼职员工一周的工作工资是¥%s", name,weekTime*hourSalary));
        }
    }
}
