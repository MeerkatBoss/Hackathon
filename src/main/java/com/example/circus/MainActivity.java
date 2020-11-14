package com.example.circus;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSector(View view) {
        switch (view.getId()) {
            case R.id.button1:
                setContentView(R.layout.sector1);
                break;
            case R.id.button2:
                setContentView(R.layout.sector2);
                break;
            case R.id.button3:
                setContentView(R.layout.sector3);
                break;
            case R.id.button4:
                setContentView(R.layout.sector4);
                break;
            case R.id.button5:
                setContentView(R.layout.sector5);
                break;
            case R.id.button6:
                setContentView(R.layout.sector6);
                break;
            case R.id.button7:
                setContentView(R.layout.sector7);
                break;
            case R.id.button8:
                setContentView(R.layout.sector8);
                break;
            case R.id.button9:
                setContentView(R.layout.sector9);
                break;
            case R.id.button10:
                setContentView(R.layout.sector10);
                break;
            default:
                setContentView(R.layout.activity_main);
                break;
        }
    }
}