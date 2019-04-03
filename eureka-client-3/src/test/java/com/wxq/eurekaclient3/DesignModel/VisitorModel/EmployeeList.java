package com.wxq.eurekaclient3.DesignModel.VisitorModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenxuqiao on 2019/4/3 10:39
 *
 * @Description 员工集合
 */
public class EmployeeList {
    private List<IEmployee> employees=new ArrayList<>();

    public void addEmployee(IEmployee employee){
        employees.add(employee);
    }

    public void show(IDepartment department){
        for(IEmployee employee:employees){
            employee.accept(department);
        }
    }
}
