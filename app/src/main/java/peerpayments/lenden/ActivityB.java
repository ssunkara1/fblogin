package peerpayments.lenden;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by sushantc on 2/28/16.
 */
public class ActivityB extends Activity {
    Button pay_button;
    String recd_val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_to);

        //Intent i2 = getIntent();
        //recd_val=i2.getStringExtra("mykey");
        //setResult(RESULT_OK, i2); //RESULT_OK is what's called the result_code
        //finish();

        pay_button=(Button) findViewById(R.id.pay);
        pay_button.setOnClickListener(new payButtonHandler());
    }

    class payButtonHandler implements View.OnClickListener {
        public void onClick(View v) {
            HTTPClient client = new HTTPClient();
            String response = client.callHTTPService();
            Toast.makeText(getApplicationContext(), response, Toast.LENGTH_LONG).show();
        }
    }


}
