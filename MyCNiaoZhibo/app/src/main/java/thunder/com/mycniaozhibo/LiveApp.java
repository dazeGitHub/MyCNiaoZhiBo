package thunder.com.mycniaozhibo;

import android.app.Application;
import android.util.Log;

import com.andruby.live.logic.IMInitMgr;
import com.andruby.live.utils.LogUitils;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.rtmp.TXLiveBase;
import com.tencent.rtmp.TXLivePusher;

import java.util.Locale;

/**
 * @description: 小直播应用类，用于全局的操作，如
 *                  sdk初始化,全局提示框
 * @author: Andruby
 * @time: 2016/12/17 10:23
 */
public class LiveApp extends Application {

    private static LiveApp instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
//        initSDK();
    }

    public static LiveApp getApplication() {
        return instance;
    }

//    public static RefWatcher getRefWatcher(Context context) {
//        LiveApp application = (LiveApp) context.getApplicationContext();
//        return application.mRefWatcher;
//    }

    /**
     * 初始化SDK，包括Bugly，IMSDK，RTMPSDK等
     */
    public void initSDK() {
        IMInitMgr.init(getApplicationContext());
        //设置rtmpsdk log回调，将log保存到文件
        TXLiveBase.getInstance().listener = new LogUitils(getApplicationContext());
    }
}
