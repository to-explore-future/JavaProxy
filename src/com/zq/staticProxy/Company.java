package com.zq.staticProxy;

import com.zq.Skills;

public class Company implements Skills {

    private Skills skills;

    /**
     * 任何一个会写代码的人都可以加入公司
     */
    public Company(Skills skills) {
        this.skills = skills;
    }

    @Override
    public void code() {
        System.out.println("....");
        System.out.println("开发分享功能之前，有运营人员提前申请好各个平台的账号,securityKey");
        System.out.println("....");
        skills.code();
        System.out.println("代码写完之后，运营部门打广告把软件卖出去");
    }

}
