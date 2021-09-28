package om.smartdot.mobile.platform.jetpackdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import om.smartdot.mobile.platform.jetpackdemo.databinding.ActivityDatabind1Binding
import om.smartdot.mobile.platform.jetpackdemo.model.Users1

/**
 * Filename:    DataBind1Activity$.java
 * Description: TODO
 * Copyright:   Copyright (c) 2016-2019 All Rights Reserved.
 * Company:     smartdot.com Inc.
 * @author $.
 * @version:    1.0
 * @Create at:  $ 10:47$
 */
class DataBind1Activity : AppCompatActivity() {
    lateinit var activityDataBinding: ActivityDatabind1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityDataBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_databind1
        )
        var user = Users1();
        user.gender.set("男")
        user.name.set("zhangsan")
        activityDataBinding.user1=user
        activityDataBinding.dataBind1Activity=this
    }

    var n: Int = 0
    fun update() {
        n++
        var user1 = Users1()
        user1.name.set("lisi" + n)
        user1.gender.set("nan" + n)
        activityDataBinding.user1 = user1;
    }
}