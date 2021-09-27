package om.smartdot.mobile.platform.jetpackdemo.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import om.smartdot.mobile.platform.jetpackdemo.BR;


/**
 * Filename:    Users.java
 * Description: TODO
 * Copyright:   Copyright (c) 2016-2019 All Rights Reserved.
 * Company:     smartdot.com Inc.
 * @author      xiely.
 * @version:    1.0
 * @Create at:  2021/9/1 14:27
 */
public class Users   extends BaseObservable {
    private String name;
    private String gender;

    public String getName() {
        return name;
    }

    @Bindable
    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }


    @Bindable
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
        notifyPropertyChanged(BR.gender);
    }
}