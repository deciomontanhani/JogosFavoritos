package br.com.deciomontanhani.jogosfavoritos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.deciomontanhani.jogosfavoritos.model.Jogo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvJogos.adapter = JogosAdapter(carregaJogos()) {
            Toast.makeText(this, it.nome, Toast.LENGTH_SHORT).show()
        }
        rvJogos.layoutManager = LinearLayoutManager(this)
    }

    private fun carregaJogos(): List<Jogo> {
        return listOf(
            godOfWar(),
            godOfWar1(),
            godOfWar2()
        )
    }

    private fun godOfWar() : Jogo {
        return Jogo(
            R.drawable.godofwar,
            "God of War - PS4",
            2018,
            "Jogo toperson"
        )
    }

    private fun godOfWar1() : Jogo {
        return Jogo(
            R.drawable.godofwar1,
            "God of War II",
            2018,
            "Topzera demais"
        )
    }

    private fun godOfWar2() : Jogo {
        return Jogo(
            R.drawable.godofwar2,
            "God of War I",
            2016,
            "O início da lenda"
        )
    }


}
