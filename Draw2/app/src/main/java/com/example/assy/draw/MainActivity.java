package com.example.assy.draw;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout board;
    private Button drawCircle,drawRect;
    private Spinner colors;
    private EditText x,y,w,h,r;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        board=(RelativeLayout)findViewById(R.id.board);
        drawCircle=(Button)findViewById(R.id.buttonCircle);
        drawRect=(Button)findViewById(R.id.buttonRectangle);
        colors=(Spinner)findViewById(R.id.spinner);
        x=(EditText)findViewById(R.id.txtX);
        y=(EditText)findViewById(R.id.txtY);
        r=(EditText)findViewById(R.id.txtRadius);
        h=(EditText)findViewById(R.id.txtH);
        w=(EditText)findViewById(R.id.txtW);

        ArrayAdapter adapter=ArrayAdapter.createFromResource(this,R.array.colors,android.R.layout.simple_spinner_item);
        colors.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void PaintCircle(View view)
    {
        if(x.getText().toString()!="" || y.getText().toString()!="" || r.getText().toString()!="")
        {
            Circle a = new Circle(Integer.parseInt(x.getText().toString()),Integer.parseInt(y.getText().toString()),Color.parseColor(colors.getSelectedItem().toString()),Integer.parseInt(r.getText().toString()),this);
            board.addView(a);
        }

    }

    public void PaintRect(View view)
    {

            Rectangle b =new Rectangle(Integer.parseInt(x.getText().toString()),Integer.parseInt(y.getText().toString()),Color.parseColor(colors.getSelectedItem().toString()),Integer.parseInt(w.getText().toString()),Integer.parseInt(h.getText().toString()),this);
            board.addView(b);
    }
}
