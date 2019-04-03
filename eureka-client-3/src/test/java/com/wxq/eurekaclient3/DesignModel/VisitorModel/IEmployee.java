package com.wxq.eurekaclient3.DesignModel.VisitorModel;

/**
 * Created by wenxuqiao on 2019/4/3 9:33
 *
 * @Description 员工接口
 */
public interface IEmployee {
    void accept(IDepartment department);
}
