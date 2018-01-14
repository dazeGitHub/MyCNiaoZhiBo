package thunder.com.mycniaozhibo.activity;

import android.content.Context;
import android.content.Intent;

import com.andruby.live.R;


/**
 * @Description:  主界面， 包括直播列表，用户信息页
 *                  UI使用FragmentTabHost+Fragment
 *                  直播列表：LiveListMainFragment
 *                  个人信息页：UserInfoFragment
 * @author: Andruby
 * @date: 2016年7月8日 下午4:46:44
 */
public class MainActivity extends LiveBaseActivity{



    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void setListener() {

    }


    public static void invoke(Context context){
        Intent intent = new Intent(context,MainActivity.class);
        context.startActivity(intent);
    }


}
