package kr.hs.emirim.koojiwon.hellogithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //여기서 OnClickListener를 엔터 쳤을때 오류나는 원인
    // 추상 클래스는 추상메서드를 1개이상 가져야함! 오버라이딩
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = (Button)findViewById(R.id.btnHello);
        //여기의 R은 resource
        btnHello.setOnClickListener(this);
    } // emd of onCreate

    @Override
    public void onClick(View v) {
        //makeText는 class 메소드 , 따라서 인스턴스변수 생성 필요없
        Toast.makeText(this, "구지원인가요~~~~?", Toast.LENGTH_SHORT).show();
    }
} // end of MainActivity
