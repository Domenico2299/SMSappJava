package file.smsappjava;

import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        EditText editTextTel = (EditText) findViewById(R.id.editTextTel);
        EditText editTextMessage = (EditText) findViewById(R.id.editTextMessage);
        String edittextel=editTextTel.getText().toString();
        String edittextmessage= editTextMessage.getText().toString();
        Uri uri = Uri.parse("smsto:"+edittextel);
        Intent it = new Intent(Intent.ACTION_SENDTO, uri);
        it.putExtra("sms_body", edittextmessage);
        startActivity(it);
    }
}
