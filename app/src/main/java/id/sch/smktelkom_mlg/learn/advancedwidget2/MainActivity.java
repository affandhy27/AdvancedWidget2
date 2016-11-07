package id.sch.smktelkom_mlg.learn.advancedwidget2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindColor;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.editTextNama)
    public void doProcess
    @BindView(R.id.textViewHasil)
    EditText etNama;
    @BindColor(R.color.colorAccent)
    TextView tvHasil;
    int colorAccent;

    @OnClick(R.id.buttonProses)

    {

        tvHasil.setText("Nama Anda: " + etNama.getText());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        tvHasil.setTextColor(colorAccent);
    }
}
