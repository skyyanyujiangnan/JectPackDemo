package om.smartdot.mobile.platform.jetpackdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import om.smartdot.mobile.platform.jetpackdemo.databinding.ActivityDatabindBinding
import om.smartdot.mobile.platform.jetpackdemo.model.Users

/**
 * Filename:    DataBindActivity$.java
 * Description: TODO
 * Copyright:   Copyright (c) 2016-2019 All Rights Reserved.
 * Company:     smartdot.com Inc.
 * @author $.
 * @version:    1.0
 * @Create at:  $ 16:01$
 */
class DataBindActivity : AppCompatActivity() {
    lateinit var activityDataBinding:  ActivityDatabindBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityDataBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_databind
        )
        var user = Users();
        user.gender = "男"
        user.name = "zhangsan"
        activityDataBinding.user=user
        activityDataBinding.my=this
    }

    var n: Int = 0
    fun showToast() {
        n++
        var user1 = Users()
        user1.name = "lisi" + n
        user1.gender = "nan" + n
        activityDataBinding.user = user1;
    }

    fun jump() {
        startActivity(Intent(this, RecycleViewActivity::class.java));
    }

}