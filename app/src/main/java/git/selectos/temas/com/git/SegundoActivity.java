package git.selectos.temas.com.git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }

    public void onClick1(View v){
        Toast.makeText(this, "presionaste el boton 1", Toast.LENGTH_SHORT).show();
    }


}
