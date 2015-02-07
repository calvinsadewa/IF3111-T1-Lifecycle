package com.vogella.androidintent;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class ResultActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);

        Bundle extra = getIntent().getExtras();
        if (extra == null) return;

        TextView edit = (TextView) findViewById(R.id.displayintentextra);
        if (extra.getString("display") != null) {
            edit.setText(extra.getString("display"));
        }
    }

    @Override
    public void finish() {

        Intent intent = new Intent();

        EditText edit = (EditText) findViewById(R.id.returnValue);

        intent.putExtra("extra",edit.getText().toString());

        setResult(RESULT_OK, intent);

        super.finish();
    }
}
