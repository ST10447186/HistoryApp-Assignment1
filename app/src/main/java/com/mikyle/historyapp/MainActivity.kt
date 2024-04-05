package com.mikyle.historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {





            //declare
            private lateinit var searchButton: Button
            private lateinit var resultTextView: TextView
            private lateinit var ageInput: EditText
            private lateinit var clearButton:Button


            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                enableEdgeToEdge()
                setContentView(R.layout.activity_main)


                //initialise
                searchButton= findViewById(R.id.searchButton)
                clearButton = findViewById(R.id.clearButton)
                ageInput = findViewById(R.id.ageInput)
                resultTextView= findViewById(R.id.resultTextView)


                searchButton.setOnClickListener {
                    val age = ageInput.text.toString().toIntOrNull()

                    if (age != null && age in 20..100) {
                        val employeeName = when (age) {
                            56 -> "Adolf Hitler- was an Austrian-born German politician who was the dictator of Nazi Germany from 1933 until his suicide in 1945 "
                            54 -> "Osama bin Laden- was a saudi-born islamic dissident and militant leader who was the founder and first general emir of al-Qaeda from 1988 until his death in 2011"
                            50 -> "Steve Jobs- was an American businessman, inventor and investor best known for co-founding the technology giant Apple Inc"
                            44 -> "Pablo Escobar- was a Colombian drug lord, narcoterrorist and politician who was the founder and sole trader of the Medellin Cartel"
                            69 -> "Griselda Blanco- was a Colombian Drug lord who was prominent in the cocaine-based drug trade and underworld of Miami, during the 1970s through the early 2000s"
                            95 -> "Nelson Mandela- was a South African anti-apartheid activist,politician and statesman who served as the first president of South Africa from 1944 to 1999"
                            78 -> "Mahatma Gandhi- was indian lawyer, anti-colonial nationalist and political ethicist who employed nonviolent resistance to lead the successful campaign for India's independence from British rule"
                            76 -> "Albert Einstein- was a German-born theoretical physicist who is widely held to be one of the greatest and most influential scientists of all time"
                            87 -> "Nikola Tesla- was a Serbian-American inventor, electrical engineer, mechanical engineer and futurist. He is known for his contributions to the design of the modern alternating current(AC) electricity supply system"
                            84 -> "Thomas Edison- was an American inventor and businessman. He developed many devices in fields such as electric power generation, mass communication,sound recording and motion picture"





                            else -> null
                        }

                        val message = if (employeeName != null) "The famous person's name is $employeeName."
                        else "No famous person found with the entered age."
                        resultTextView.text = message

                    } else {
                        resultTextView.text = "Invalid input. Please enter a valid age between 20 and 100."
                    }
                }

                clearButton.setOnClickListener {
                    ageInput.text.clear()
                    resultTextView.text = ""
                }
            }
        }


