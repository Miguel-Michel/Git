package git.selectos.temas.com.git;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v){
        Intent intenta_Segundo_Activity = new Intent(MainActivity.this, SegundoActivity.class);
        startActivity(intenta_Segundo_Activity);
    }
}
