package mx.edu.potros.examenu2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView

var stock: ArrayList<Detalles> = ArrayList<Detalles>()

class DetalleRegalos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        stock = ArrayList<Detalles>()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_regalos)
        var stockOpt: String? = intent.getStringExtra("MenuType")
        agregarStock(stockOpt)

        var titulo: TextView = findViewById(R.id.title1)

        when (stockOpt) {
            "Detalles" -> {
                titulo.text = "Detalles"
            }

            "Globos" -> {
                titulo.text = "Globos"
            }

            "Peluches" -> {
                titulo.text = "Peluches"
            }

            "Regalos" -> {
                titulo.text = "Regalos"
            }

            "Tazas" -> {
                titulo.text = "Tazas"
            }
        }

        val gridView = findViewById<GridView>(R.id.gridView11)

        var adaptador: AdaptadorProductos = AdaptadorProductos(this, stock)
        gridView.adapter = adaptador

    }

    fun agregarStock(Option: String?) {
        when (Option) {
            "Detalles" -> {
                stock.add(Detalles(R.drawable.grupo2, 5.69))


            }

            "Globos" -> {
                stock.add(Detalles(R.drawable.globoamor, 5.69))
                stock.add(Detalles(R.drawable.globocumple, 5.69))
                stock.add(Detalles(R.drawable.globonum, 5.69))
                stock.add(Detalles(R.drawable.globofestejo, 5.69))
                stock.add(Detalles(R.drawable.globoregalo, 5.69))
            }

            "Peluches" -> {
                stock.add(Detalles(R.drawable.peluchemario, 5.69))
                stock.add(Detalles(R.drawable.pelucheminecraft, 5.69))
                stock.add(Detalles(R.drawable.peluchepeppa, 5.69))
                stock.add(Detalles(R.drawable.peluchesony, 5.69))
                stock.add(Detalles(R.drawable.peluchestich, 5.69))
                stock.add(Detalles(R.drawable.peluchevarios, 5.69))
            }

            "Regalos" -> {
                stock.add(Detalles(R.drawable.regaloazul, 5.69))
                stock.add(Detalles(R.drawable.regalobebe, 5.69))
                stock.add(Detalles(R.drawable.regalocajas, 5.69))
                stock.add(Detalles(R.drawable.regalocolores, 5.69))
                stock.add(Detalles(R.drawable.regalovarios, 5.69))

            }

            "Tazas" -> {
                stock.add(Detalles(R.drawable.tazalove, 5.69))
                stock.add(Detalles(R.drawable.tazaabuela, 5.69))
                stock.add(Detalles(R.drawable.tazaquiero, 5.69))

            }
        }
    }

    private class AdaptadorProductos : BaseAdapter {
        var producto = ArrayList<Detalles>()
        var contexto: Context? = null

        constructor(contexto: Context, producto: ArrayList<Detalles>) {
            this.producto = producto
            this.contexto = contexto
        }

        override fun getCount(): Int {
            return producto.size

        }

        override fun getItem(position: Int): Any {
            return producto[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var prod = producto[position]
            var inflador = LayoutInflater.from(contexto)
            var vista = inflador.inflate(R.layout.activity_detalle_regalos, null)

            var imagen = vista.findViewById(R.id.iv_regalo_imagen) as ImageView
            var precio = vista.findViewById(R.id.tv_regalo_precio) as TextView

            imagen.setImageResource(prod.image)
            precio.setText("$${prod.precio}")

            return vista

        }
    }
}