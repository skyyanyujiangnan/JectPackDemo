package om.smartdot.mobile.platform.jetpackdemo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.SavedStateHandle
import om.smartdot.mobile.platform.jetpackdemo.databinding.ActivityMainBinding
import java.util.logging.Logger


class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        activityMainBinding.main = this
    }

    fun jumpDataBing() {
        startActivity(Intent(this, DataBindActivity::class.java));
    }
    fun jumpDataBing1() {
        startActivity(Intent(this, DataBind1Activity::class.java));
    }
    fun jumpRecycleDataBinging() {
        startActivity(Intent(this, RecycleViewActivity::class.java));
    }

    fun jumpLifeCycle() {
//        startActivity(Intent(this, LifeCycleActicity::class.java));
    }
}