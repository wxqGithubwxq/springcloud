package com.wxq.eurekaclient3.DesignModel.VisitorModel;

/**
 * Created by wenxuqiao on 2019/4/3 9:39
 *
 * @Description 兼职员工
 */
public class PartTimeEmployee implements IEmployee{
    public String name;
    public double weekTime;//一周工作时间
    public double hourSalary;//小时工资
    public PartTimeEmployee(String name,double weekTime,double hourSalary){
        this.name=name;
        this.weekTime=weekTime;
        this.hourSalary=hourSalary;
    }
    @Override
    public void accept(IDepartment department) {
        department.view(this);
    }
}
