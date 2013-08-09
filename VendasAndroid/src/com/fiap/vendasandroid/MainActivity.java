package com.fiap.vendasandroid;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
   
        Button botao = (Button) findViewById(R.id.btnConsultar);
        botao.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		TextView codProduto = (TextView) findViewById(R.id.inputConsultar);
		TextView descProduto = (TextView) findViewById(R.id.descProduto);
		
		if(codProduto.equals("1")){
			Toast.makeText(this, "R$: 95,00", Toast.LENGTH_LONG).show();
			descProduto.setText("Calça");
		}else{
			Toast.makeText(this, "R$: 35,00", Toast.LENGTH_LONG).show();
			descProduto.setText("Blusa");		
		}
		
		
		
		AlertDialog.Builder adBuilder = new AlertDialog.Builder(this);
		adBuilder.setTitle("Promoção RELAMPAGO");
		adBuilder.setMessage("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer ut leo ut sem elementum tempus a ut sapien. ");
		adBuilder.setPositiveButton("OK", null);
		adBuilder.show();
		
	}

    

    
}
