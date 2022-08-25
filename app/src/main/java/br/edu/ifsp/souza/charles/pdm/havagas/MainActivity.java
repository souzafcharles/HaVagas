package br.edu.ifsp.souza.charles.pdm.havagas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.Toast;

import br.edu.ifsp.souza.charles.pdm.havagas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding amb;
    private FormularioCadastro formularioCadastro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.getRoot());

        amb.limparBtn.setOnClickListener(view -> {
            amb.nomeEt.setText("");
            amb.emailEt.setText("");
            amb.recebeEmailCb.setChecked(false);
            amb.telefoneEt.setText(null);
            amb.celularCb.setChecked(false);
            amb.celularCb.setChecked(false);
            amb.masculinoRb.setChecked(true);
            amb.dataNascimentoEt.setText("");
            amb.formacaoSp.setSelection(0);
            amb.vagasEt.setText("");
            formularioCadastro = null;
        });
        amb.salvarBtn.setOnClickListener( view -> {
            formularioCadastro = new FormularioCadastro(
                    amb.nomeEt.getText().toString(),
                    amb.emailEt.getText().toString(),
                    amb.telefoneEt.getText().toString(),
                    amb.masculinoRb.isChecked() ? amb.masculinoRb.getText().toString() : amb.femininoRb.getText().toString(),
                    amb.dataNascimentoEt.getText().toString(),
                    amb.formacaoSp.getSelectedItem().toString(),
                    amb.vagasEt.getText().toString(),
            );

            if( (amb.formacaoSp.getSelectedItemPosition() == 0) || (amb.formacaoSp.getSelectedItemPosition() == 1) ){
                formularioCadastro.setAnoConclusao(amb.anoFormaturaEt.getText().toString());
                formularioCadastro.setAnoConclusao(null);
                formularioCadastro.setInstituicao(null);
                formularioCadastro.setTituloMonografia(null);
                formularioCadastro.setOrientador(null);
            }
            if( (amb.formacaoSp.getSelectedItemPosition() == 2) || (amb.formacaoSp.getSelectedItemPosition() == 3) ){
                formularioCadastro.setAnoConclusao(amb.anoConclusaoMestradoDoutoradoEt.getText().toString());
                formularioCadastro.setInstituicao(amb.instituicaoMestradoDoutoradoEt.getText().toString());
            }
            if( (amb.formacaoSp.getSelectedItemPosition() == 4) || (amb.formacaoSp.getSelectedItemPosition() == 5) ){
                formularioCadastro.setAnoConclusao(amb.anoConclusaoGraduacaoEspecializacaoEt.getText().toString());
                formularioCadastro.setInstituicao(amb.instituicaoGraduacaoEspecializacaoEt.getText().toString());
                formularioCadastro.setTituloMonografia(amb.tituloMonografiaEt.getText().toString());
                formularioCadastro.setOrientador(amb.orientadorEt.getText().toString());
            }
            Toast.makeText(this, formularioCadastro.toString(), Toast.LENGTH_SHORT).show();
        });
        amb.celularCb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked()){
                    amb.celularEt.setVisibility(View.VISIBLE);
                }else{
                    amb.celularEt.setVisibility(View.GONE);
                }
            }
        });
        amb.formacaoSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if ((i != 0) && (i != 1)) {
                    if( (i == 2) || (i == 3) ){
                        amb.instituicaoGraduacaoEspecializacaoEt.setVisibility(view.VISIBLE);
                        amb.anoFormaturaEt.setVisibility(view.GONE);
                    } else if( (i == 4) || (i == 5) ){
                        amb.anoConclusaoMestradoDoutoradoEt.setVisibility(view.VISIBLE);
                        amb.instituicaoMestradoDoutoradoEt.setVisibility(view.VISIBLE);
                        amb.anoFormaturaEt.setVisibility(view.GONE);
                    }
                } else {
                    amb.anoFormaturaEt.setVisibility(view.VISIBLE);
                    amb.graducaoEspecializacaoLl.setVisibility(view.GONE);
                    amb.mestradoDoutoradoLl.setVisibility(view.GONE);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}