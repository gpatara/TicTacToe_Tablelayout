package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.myapplication.R


class MainActivity : AppCompatActivity(), View.OnClickListener{

private var button1: Button? = null
private var button2: Button? = null
private var button3: Button? = null
private var button4: Button? = null
private var button5: Button? = null
private var button6: Button? = null
private var button7: Button? = null
private var button8: Button? = null
private var button9: Button? = null

private var resetButton: Button? = null

private var firstPlayer = ArrayList<Int>()
private var secondPlayer = ArrayList<Int>()

private var activePlayer = 1

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    init()

}

private fun init() {

    button1 = findViewById(R.id.button1)
    button2 = findViewById(R.id.button2)
    button3 = findViewById(R.id.button3)
    button4 = findViewById(R.id.button4)
    button5 = findViewById(R.id.button5)
    button6 = findViewById(R.id.button6)
    button7 = findViewById(R.id.button7)
    button8 = findViewById(R.id.button8)
    button9 = findViewById(R.id.button9)

    resetButton = findViewById(R.id.bRestart)

    button1?.setOnClickListener(this)
    button2?.setOnClickListener(this)
    button3?.setOnClickListener(this)
    button4?.setOnClickListener(this)
    button5?.setOnClickListener(this)
    button6?.setOnClickListener(this)
    button7?.setOnClickListener(this)
    button8?.setOnClickListener(this)
    button9?.setOnClickListener(this)
    resetButton?.setOnClickListener {
        reset()

    }

}

override fun onClick(clickedView: View?) {

    if (clickedView is Button?) {

        var buttonNumber = 0

        when (clickedView?.id) {
            R.id.button1 -> buttonNumber = 1
            R.id.button2 -> buttonNumber = 2
            R.id.button3 -> buttonNumber = 3
            R.id.button4 -> buttonNumber = 4
            R.id.button5 -> buttonNumber = 5
            R.id.button6 -> buttonNumber = 6
            R.id.button7 -> buttonNumber = 7
            R.id.button8 -> buttonNumber = 8
            R.id.button9 -> buttonNumber = 9
        }

        if (buttonNumber != 0) {
            playGame(buttonNumber, clickedView)
        }

    }

}

private fun playGame(buttonNumber: Int, clickedButton: Button?) {
    if (activePlayer == 1) {
        clickedButton?.text = "X"
        clickedButton?.setBackgroundColor(Color.RED)
        firstPlayer.add(buttonNumber)
        activePlayer = 2
    } else {
        clickedButton?.text = "O"
        clickedButton?.setBackgroundColor(Color.GREEN)
        secondPlayer.add(buttonNumber)
        activePlayer = 1
    }
    clickedButton?.isEnabled = false
    check()
}

private fun check() {

    var winnerPlayer = 0
    if (firstPlayer.contains(1) && firstPlayer.contains(2) && firstPlayer.contains(3)) {
        winnerPlayer = 1
        button1?.isEnabled = false
        button2?.isEnabled = false
        button3?.isEnabled = false
        button4?.isEnabled = false
        button5?.isEnabled = false
        button6?.isEnabled = false
        button7?.isEnabled = false
        button8?.isEnabled = false
        button9?.isEnabled = false
    }
    if (secondPlayer.contains(1) && secondPlayer.contains(2) && secondPlayer.contains(3)) {
        winnerPlayer = 2
        button1?.isEnabled = false
        button2?.isEnabled = false
        button3?.isEnabled = false
        button4?.isEnabled = false
        button5?.isEnabled = false
        button6?.isEnabled = false
        button7?.isEnabled = false
        button8?.isEnabled = false
        button9?.isEnabled = false
    }

    if (firstPlayer.contains(4) && firstPlayer.contains(5) && firstPlayer.contains(6)) {
        winnerPlayer = 1
        button1?.isEnabled = false
        button2?.isEnabled = false
        button3?.isEnabled = false
        button4?.isEnabled = false
        button5?.isEnabled = false
        button6?.isEnabled = false
        button7?.isEnabled = false
        button8?.isEnabled = false
        button9?.isEnabled = false
    }
    if (secondPlayer.contains(4) && secondPlayer.contains(5) && secondPlayer.contains(6)) {
        winnerPlayer = 2
        button1?.isEnabled = false
        button2?.isEnabled = false
        button3?.isEnabled = false
        button4?.isEnabled = false
        button5?.isEnabled = false
        button6?.isEnabled = false
        button7?.isEnabled = false
        button8?.isEnabled = false
        button9?.isEnabled = false
    }

    if (firstPlayer.contains(7) && firstPlayer.contains(8) && firstPlayer.contains(9)) {
        winnerPlayer = 1
        button1?.isEnabled = false
        button2?.isEnabled = false
        button3?.isEnabled = false
        button4?.isEnabled = false
        button5?.isEnabled = false
        button6?.isEnabled = false
        button7?.isEnabled = false
        button8?.isEnabled = false
        button9?.isEnabled = false
    }
    if (secondPlayer.contains(7) && secondPlayer.contains(8) && secondPlayer.contains(9)) {
        winnerPlayer = 2
        button1?.isEnabled = false
        button2?.isEnabled = false
        button3?.isEnabled = false
        button4?.isEnabled = false
        button5?.isEnabled = false
        button6?.isEnabled = false
        button7?.isEnabled = false
        button8?.isEnabled = false
        button9?.isEnabled = false
    }

    if (firstPlayer.contains(1) && firstPlayer.contains(4) && firstPlayer.contains(7)) {
        winnerPlayer = 1
        button1?.isEnabled = false
        button2?.isEnabled = false
        button3?.isEnabled = false
        button4?.isEnabled = false
        button5?.isEnabled = false
        button6?.isEnabled = false
        button7?.isEnabled = false
        button8?.isEnabled = false
        button9?.isEnabled = false
    }
    if (secondPlayer.contains(1) && secondPlayer.contains(4) && secondPlayer.contains(7)) {
        winnerPlayer = 2
        button1?.isEnabled = false
        button2?.isEnabled = false
        button3?.isEnabled = false
        button4?.isEnabled = false
        button5?.isEnabled = false
        button6?.isEnabled = false
        button7?.isEnabled = false
        button8?.isEnabled = false
        button9?.isEnabled = false
    }

    if (firstPlayer.contains(2) && firstPlayer.contains(5) && firstPlayer.contains(8)) {
        winnerPlayer = 1
        button1?.isEnabled = false
        button2?.isEnabled = false
        button3?.isEnabled = false
        button4?.isEnabled = false
        button5?.isEnabled = false
        button6?.isEnabled = false
        button7?.isEnabled = false
        button8?.isEnabled = false
        button9?.isEnabled = false
    }
    if (secondPlayer.contains(2) && secondPlayer.contains(5) && secondPlayer.contains(8)) {
        winnerPlayer = 2
        button1?.isEnabled = false
        button2?.isEnabled = false
        button3?.isEnabled = false
        button4?.isEnabled = false
        button5?.isEnabled = false
        button6?.isEnabled = false
        button7?.isEnabled = false
        button8?.isEnabled = false
        button9?.isEnabled = false
    }

    if (firstPlayer.contains(3) && firstPlayer.contains(6) && firstPlayer.contains(9)) {
        winnerPlayer = 1
        button1?.isEnabled = false
        button2?.isEnabled = false
        button3?.isEnabled = false
        button4?.isEnabled = false
        button5?.isEnabled = false
        button6?.isEnabled = false
        button7?.isEnabled = false
        button8?.isEnabled = false
        button9?.isEnabled = false
    }
    if (secondPlayer.contains(3) && secondPlayer.contains(6) && secondPlayer.contains(9)) {
        winnerPlayer = 2
        button1?.isEnabled = false
        button2?.isEnabled = false
        button3?.isEnabled = false
        button4?.isEnabled = false
        button5?.isEnabled = false
        button6?.isEnabled = false
        button7?.isEnabled = false
        button8?.isEnabled = false
        button9?.isEnabled = false
    }

    if (firstPlayer.contains(1) && firstPlayer.contains(5) && firstPlayer.contains(9)) {
        winnerPlayer = 1
        button1?.isEnabled = false
        button2?.isEnabled = false
        button3?.isEnabled = false
        button4?.isEnabled = false
        button5?.isEnabled = false
        button6?.isEnabled = false
        button7?.isEnabled = false
        button8?.isEnabled = false
        button9?.isEnabled = false
    }
    if (secondPlayer.contains(1) && secondPlayer.contains(5) && secondPlayer.contains(9)) {
        winnerPlayer = 2
        button1?.isEnabled = false
        button2?.isEnabled = false
        button3?.isEnabled = false
        button4?.isEnabled = false
        button5?.isEnabled = false
        button6?.isEnabled = false
        button7?.isEnabled = false
        button8?.isEnabled = false
        button9?.isEnabled = false
    }

    if (firstPlayer.contains(3) && firstPlayer.contains(5) && firstPlayer.contains(7)) {
        winnerPlayer = 1
        button1?.isEnabled = false
        button2?.isEnabled = false
        button3?.isEnabled = false
        button4?.isEnabled = false
        button5?.isEnabled = false
        button6?.isEnabled = false
        button7?.isEnabled = false
        button8?.isEnabled = false
        button9?.isEnabled = false
    }
    if (secondPlayer.contains(3) && secondPlayer.contains(5) && secondPlayer.contains(7)) {
        winnerPlayer = 2
        button1?.isEnabled = false
        button2?.isEnabled = false
        button3?.isEnabled = false
        button4?.isEnabled = false
        button5?.isEnabled = false
        button6?.isEnabled = false
        button7?.isEnabled = false
        button8?.isEnabled = false
        button9?.isEnabled = false
    }

    if (winnerPlayer != 0) {
        if (winnerPlayer == 1) {
            Toast.makeText(this, "X Wins!", Toast.LENGTH_SHORT).show()

        } else if (winnerPlayer == 2) {
            Toast.makeText(this, "O Wins!", Toast.LENGTH_SHORT).show()
        }
    }
    if (button1?.isEnabled == false &&
        button2?.isEnabled == false &&
        button3?.isEnabled == false &&
        button4?.isEnabled == false &&
        button5?.isEnabled == false &&
        button6?.isEnabled == false &&
        button7?.isEnabled == false &&
        button8?.isEnabled == false &&
        button9?.isEnabled == false && winnerPlayer == 0
    ) {

        Toast.makeText(this, "Tie!", Toast.LENGTH_LONG).show()
    }

}

fun reset() {
    button1?.setBackgroundResource(android.R.drawable.btn_default)
    button2?.setBackgroundResource(android.R.drawable.btn_default)
    button3?.setBackgroundResource(android.R.drawable.btn_default)
    button4?.setBackgroundResource(android.R.drawable.btn_default)
    button5?.setBackgroundResource(android.R.drawable.btn_default)
    button6?.setBackgroundResource(android.R.drawable.btn_default)
    button7?.setBackgroundResource(android.R.drawable.btn_default)
    button8?.setBackgroundResource(android.R.drawable.btn_default)
    button9?.setBackgroundResource(android.R.drawable.btn_default)

    button1?.isEnabled = true
    button2?.isEnabled = true
    button3?.isEnabled = true
    button4?.isEnabled = true
    button5?.isEnabled = true
    button6?.isEnabled = true
    button7?.isEnabled = true
    button8?.isEnabled = true
    button9?.isEnabled = true

    button1?.text = ""
    button2?.text = ""
    button3?.text = ""
    button4?.text = ""
    button5?.text = ""
    button6?.text = ""
    button7?.text = ""
    button8?.text = ""
    button9?.text = ""

    firstPlayer.clear()
    secondPlayer.clear()


}
}