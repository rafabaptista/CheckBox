package checkbox.studio.com.checkbox;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity {

    private CheckBox checkCao;
    private CheckBox checkGato;
    private CheckBox checkPapagaio;

    private Button botaoMostrar;
    private TextView textExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkCao = (CheckBox)findViewById(R.id.checkCao);
        checkGato = (CheckBox)findViewById(R.id.checkGato);
        checkPapagaio = (CheckBox)findViewById(R.id.checkPapagaio);

        botaoMostrar = (Button)findViewById(R.id.botaoMostrar);
        textExibicao = (TextView)findViewById(R.id.textExibicao);

        botaoMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itensSelecionados = "";

                itensSelecionados += "Item: " + checkCao.getText() + " Status: " + checkCao.isChecked() + "\n";
                itensSelecionados += "Item: " + checkGato.getText() + " Status: " + checkGato.isChecked() + "\n";
                itensSelecionados += "Item: " + checkPapagaio.getText() + " Status: " + checkPapagaio.isChecked() + "\n";

                textExibicao.setText(itensSelecionados);
            }
        });
    }
}
