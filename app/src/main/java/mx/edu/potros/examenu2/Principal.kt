package mx.edu.potros.examenu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        var btndtalles: Button = findViewById(R.id.btn_detalles) as Button
        var btnglobos: Button = findViewById(R.id.btn_globos) as Button
        var btnpeluches: Button = findViewById(R.id.btn_peluches) as Button
        var btnRegalos: Button = findViewById(R.id.btn_regalos) as Button
        var btntazas: Button = findViewById(R.id.btn_tazas) as Button


        btndtalles.setOnClickListener {
            var intent = Intent(this, DetalleRegalos::class.java)
            intent.putExtra("menuType", "Detalles")
            startActivity(intent)
        }
        btnglobos.setOnClickListener {
            var intent = Intent(this, DetalleRegalos::class.java)
            intent.putExtra("menuType", "Globos")
            startActivity(intent)
        }
        btnpeluches.setOnClickListener {
            var intent = Intent(this, DetalleRegalos::class.java)
            intent.putExtra("menuType", "Peluches")
            startActivity(intent)
        }
        btnRegalos.setOnClickListener {
            var intent = Intent(this, DetalleRegalos::class.java)
            intent.putExtra("menuType", "Regalos")
            startActivity(intent)
        }
        btntazas.setOnClickListener {
            var intent = Intent(this, DetalleRegalos::class.java)
            intent.putExtra("menuType", "tazas")
            startActivity(intent)
        }

    }
}

