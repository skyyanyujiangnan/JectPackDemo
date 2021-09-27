package om.smartdot.mobile.platform.jetpackdemo

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import om.smartdot.mobile.platform.jetpackdemo.databinding.ActivityRecycleviewBinding

/**
 * Filename:    RecycleViewActivity$.java
 * Description: TODO
 * Copyright:   Copyright (c) 2016-2019 All Rights Reserved.
 * Company:     smartdot.com Inc.
 * @author $.
 * @version:    1.0
 * @Create at:  $ 16:06$
 */
class RecycleViewActivity : AppCompatActivity() {
    var recycleDataBinding: ActivityRecycleviewBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recycleDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_recycleview);

    }
}