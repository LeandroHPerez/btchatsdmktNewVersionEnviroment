package br.edu.ifsp.scl.btchatsdmkt

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SelecionarModoActivity : AppCompatActivity() {


    private lateinit var btnServidor: Button
    private lateinit var btnCliente: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selecionar_modo)

        btnServidor = findViewById(R.id.btnModoServidor)
        btnCliente = findViewById(R.id.btnModoCliente)
    }



    fun definirModoBlueTooth(view: View) {
        val intent = Intent(this@SelecionarModoActivity, MainActivity::class.java)

        if (view == btnCliente) {
            intent.setAction(BluetoothSingleton.Constantes.CODIGO_CLIENTE)
        } else {
            intent.setAction(BluetoothSingleton.Constantes.CODIGO_SERVIDOR)
        }

        startActivity(intent)
    }
}
