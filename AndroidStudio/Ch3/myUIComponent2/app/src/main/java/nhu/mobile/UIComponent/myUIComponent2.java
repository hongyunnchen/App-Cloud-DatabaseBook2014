package nhu.mobile.UIComponent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class myUIComponent2 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    	TextView textView1, textView2;
    	Button button1, button2;
    	
        textView1 = (TextView) findViewById(R.id.TextView01);
        textView1.setText("��r�@");  
        
        button1 = (Button) findViewById(R.id.Button01);
        button1.setText("���s�@");          
        
        textView2 = (TextView) findViewById(R.id.TextView02);
        textView2.setText("��r�G");  
        
        button2 = (Button) findViewById(R.id.Button02);
        button2.setText("���s�G");         
    }
}