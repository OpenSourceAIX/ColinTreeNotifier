/**
 * @author ColinTree (colinycl123@gmail.com)
 */

package cn.colintree.aix;

import android.content.Context;
import android.util.Log;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.runtime.util.*;
import android.widget.Toast;
import android.view.Gravity;

@DesignerComponent(version = ColinTreeNotifier.VERSION,
    description = "by ColinTree at http://aix.colintree.cn",
    category = ComponentCategory.EXTENSION,
    nonVisible = true,
    iconName = "images/extension.png")

@SimpleObject(external = true)

public class ColinTreeNotifier extends AndroidNonvisibleComponent
implements Component {
    public static final int VERSION = 1;
    private ComponentContainer container;
    private Context context;
    private static final String LOG_TAG = "ColinTreeNotifier";
    public ColinTreeNotifier(ComponentContainer container) {
        super(container.$form());
        this.container = container;
        context = (Context) container.$context();
        Log.d(LOG_TAG, "ColinTreeNotifier Created" );
    }
    
    @SimpleFunction(description = "Show a original toast of android")
    public void ShowAlert(String notice,boolean longNotification) {
    	if (longNotification)
    		Toast.makeText(context,notice,Toast.LENGTH_LONG).show();
    	else
    		Toast.makeText(context,notice,Toast.LENGTH_SHORT).show();
    }
    @SimpleFunction(description = "Show a original toast of android at the center of the screen")
    public void ShowAlertAtCenter(String notice,boolean longNotification){
    	Toast toast;
    	if (longNotification)
    		toast = Toast.makeText(context,notice,Toast.LENGTH_LONG);
    	else
    		toast = Toast.makeText(context,notice,Toast.LENGTH_SHORT);
    	toast.setGravity(Gravity.CENTER, 0, 0);
    	toast.show();
    }
}