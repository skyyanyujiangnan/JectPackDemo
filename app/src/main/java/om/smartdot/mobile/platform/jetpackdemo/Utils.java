package om.smartdot.mobile.platform.jetpackdemo;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

import java.lang.reflect.Method;

/**
 * Filename:    Utils$.java
 * Description: TODO
 * Copyright:   Copyright (c) 2016-2019 All Rights Reserved.
 * Company:     smartdot.com Inc.
 *
 * @author $.
 * @version: 1.0
 * @Create at:  $ 14:50$
 */
public class Utils {
    /**
     * 获取底部虚拟按键高度
     * @param context
     * @return
     */
    public static int getNavigationBarHeight(Context context) {
        //获取虚拟按键的高度
            int result = 0;
            Resources res = context.getResources();
            int resourceId = res.getIdentifier("navigation_bar_height", "dimen", "android");
            if (resourceId > 0) {
                result = res.getDimensionPixelSize(resourceId);
            }
            return result;
    }

} 