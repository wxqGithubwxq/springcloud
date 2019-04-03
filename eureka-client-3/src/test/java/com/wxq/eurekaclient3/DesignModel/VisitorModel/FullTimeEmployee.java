package com.wxq.eurekaclient3.DesignModel.VisitorModel;

/**
 * Created by wenxuqiao on 2019/4/3 9:37
 *
 * @Description 全职员工
 */
public class FullTimeEmployee implements IEmployee{
    public String name;//姓名
    public double weekTime;//一周工作时间
    public double weekSalary;//一周基本工资
    public FullTimeEmployee(String name,double weekTime,double weekSalary){
        this.name=name;
        this.weekTime=weekTime;
        this.weekSalary=weekSalary;
    }
    @Override
    public void accept(IDepartment department) {
        department.view(this);
    }
}
