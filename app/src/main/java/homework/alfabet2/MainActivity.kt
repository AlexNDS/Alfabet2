package homework.alfabet2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.Char as Char1
import kotlin.charArrayOf as kotlinCharArrayOf
import kotlin.collections.arrayListOf as arrayListOf1
import kotlin.collections.listOfNotNull as listOfNotNull1


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloTextView: TextView = findViewById(R.id.abc_char)
        helloTextView.textSize = 30f

        val Button: Button = findViewById(R.id.button)


     //   val abc :  List<Char>


        val abc = kotlin.collections.arrayListOf<kotlin.Char>() //создали коллекцию из символов
        var ABC = abc.toMutableList() // превратили коллекцию в изменяемую


        for (k in 0..25) {   // наполняем коллекцию буквами алфавита

            val ascii = k + 65
            val char = ascii.toChar() // берем символ из таблицы acsii
            if (k % 2 == 0) {}  // определяем четность
            else{
            ABC.add(char)}

        }

        Button.setOnClickListener {
            println(abc.javaClass)
            helloTextView.text = ABC.toString()
        }


                }
            }




